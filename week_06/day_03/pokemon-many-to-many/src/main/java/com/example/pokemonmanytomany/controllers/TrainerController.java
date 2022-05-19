package com.example.pokemonmanytomany.controllers;

import com.example.pokemonmanytomany.model.Trainer;
import com.example.pokemonmanytomany.repository.TrainerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainerController {

//    Attributes

    private TrainerRepository trainerRepository;


//    Constructors

    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

//    Methods

    @GetMapping("/trainer/{id}")
    Trainer getTrainer(@PathVariable("id") int id) {
        return trainerRepository.getTrainer(id);
    }

    @GetMapping("/trainers_1")
    public ResponseEntity<List<Trainer>> getAllTrainers() {

        List<Trainer> trainers = trainerRepository.findAll();

        return ResponseEntity
                .ok()
                .body(trainers);
    }

    @PostMapping("/trainers_2")
    public ResponseEntity<Trainer> createStudent(@RequestBody Trainer trainer) {
        Trainer result = trainerRepository.save(trainer);
        return ResponseEntity
                .ok()
                .body(result);
    }



}
