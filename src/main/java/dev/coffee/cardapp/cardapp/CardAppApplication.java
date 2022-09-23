package dev.coffee.cardapp.cardapp;

import dev.coffee.cardapp.cardapp.domain.Car;
import dev.coffee.cardapp.cardapp.domain.Owner;
import dev.coffee.cardapp.cardapp.repository.CarRepository;
import dev.coffee.cardapp.cardapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardAppApplication implements CommandLineRunner {

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;
	public static void main(String[] args) {
		SpringApplication.run(CardAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Add owner objects and save these to db
		Owner owner1 = Owner.builder()
				.firstName("John")
				.lastName("Johnson")
				.build();
		Owner owner2 = Owner.builder()
				.firstName("Mary")
				.lastName("Robinson")
				.build();

		ownerRepository.saveAll(Arrays.asList(owner1, owner2));

		carRepository.save(new Car("Ford", "Mustang", "Blue", "ADF-1121", 2021, 59000, owner1));

		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000, owner2));

		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owner2));

		Iterable<Car> cars = carRepository.findAll();
		System.out.println(cars);
	}
}
