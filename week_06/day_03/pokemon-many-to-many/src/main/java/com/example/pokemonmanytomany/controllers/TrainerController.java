package com.example.pokemonmanytomany.controllers;

import com.example.pokemonmanytomany.model.Trainer;
import com.example.pokemonmanytomany.repository.TrainerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainerController {

//    Attributes

    private TrainerRepository trainerRepository;


//    Constructors

    public TrainerController() {}

    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

//    Methods

    @GetMapping("/all_trainers")
    public ResponseEntity<List<Trainer>> getAllTrainers() {

        List<Trainer> trainers = trainerRepository.findAll();

        return ResponseEntity
                .ok()
                .body(trainers);
    }



}
