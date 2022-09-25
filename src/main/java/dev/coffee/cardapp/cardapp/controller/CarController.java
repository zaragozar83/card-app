package dev.coffee.cardapp.cardapp.controller;

import dev.coffee.cardapp.cardapp.repository.entity.Car;
import dev.coffee.cardapp.cardapp.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarRepository carRepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        // Fetch and return cars
        return carRepository.findAll();
    }
}
