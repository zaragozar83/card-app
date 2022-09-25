package dev.coffee.cardapp.cardapp.repository;

import dev.coffee.cardapp.cardapp.repository.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Integer> {

    List<Car> findCardsByBrand(String brand);
    List<Car> findCardsByColor(String color);
    List<Car> findCardsByModelYear(Integer modelYear);
    List<Car> findCardsByBrandAndModel(String brand, String model);
    List<Car> findCardsByBrandOrColor(String brand, String color);
    List<Car> findCardsByBrandOrderByModelYearAsc(String brand);
}
