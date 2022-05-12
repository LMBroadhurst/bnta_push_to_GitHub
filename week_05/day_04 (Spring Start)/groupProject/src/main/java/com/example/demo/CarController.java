package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    private List<Car> cars;

    public CarController() {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Fiesta"));
        cars.add(new Car("BMW", "X7"));
        cars.add(new Car("Batmobile", "Wayne Enterprises"));
    }

    @GetMapping("/cars")
    List<Car> getAll() {
        return cars;
    }

}
