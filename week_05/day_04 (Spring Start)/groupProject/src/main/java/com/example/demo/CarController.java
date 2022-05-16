package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    // Create, Read, Update, Delete = HTTP POST, GET, PUT, DELETE

    // Our fake db - create a list of hobbits

    private List<Car> cars;

    public CarController() {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Fiesta"));
        cars.add(new Car("BMW", "X7"));
        cars.add(new Car("Batmobile", "Wayne Enterprises"));
    }

    // Accept HTTP GET, localhost:8080/hobbits
    @GetMapping("/cars")
    List<Car> getAll() {
        return cars;
    }

    // Accept HTTP POST, localhost:8080/hobbits
    @PostMapping("/cars")
    Car post(@RequestBody Car car) {

//        Add new car to list.
        cars.add(car);

//        Returns last hobbit from list.
        return cars.get(cars.size() - 1);
    }

    // Accept HTTP DELETE, localhost:8080/hobbits
    @DeleteMapping("/cars/{id}")
    void delete(@PathVariable int id) {
        cars.remove(id);
    }

}
