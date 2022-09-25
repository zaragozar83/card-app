package dev.coffee.cardapp.cardapp;

import dev.coffee.cardapp.cardapp.repository.entity.Car;
import dev.coffee.cardapp.cardapp.repository.entity.Owner;
import dev.coffee.cardapp.cardapp.repository.CarRepository;
import dev.coffee.cardapp.cardapp.repository.OwnerRepository;
import dev.coffee.cardapp.cardapp.repository.entity.ranch.RanchEntity;
import dev.coffee.cardapp.cardapp.repository.repository.RanchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class CardAppApplication implements CommandLineRunner {

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	private RanchRepository ranchRepository;
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

		Set<Owner> owners = new HashSet<>();
		owners.add(owner1);
		owners.add(owner2);

		ownerRepository.saveAll(Arrays.asList(owner1, owner2));

		carRepository.save(new Car("Ford", "Mustang", "Blue", "ADF-1121", 2021, 59000, owners));

		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000, owners));

		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owners));

		Iterable<Car> cars = carRepository.findAll();
		System.out.println(cars);

		List<RanchEntity> ranchEntities = Arrays.asList(
				RanchEntity.builder()
						.name("Bates 1")
						.description("Bates Ranch")
						.build(),
				RanchEntity.builder()
						.name("Onchard")
						.description("Onchard Ranch")
						.build(),
				RanchEntity.builder()
						.name("Blured")
						.description("Blured Ranch")
						.build()
		);

		ranchRepository.saveAll(ranchEntities);
	}
}
