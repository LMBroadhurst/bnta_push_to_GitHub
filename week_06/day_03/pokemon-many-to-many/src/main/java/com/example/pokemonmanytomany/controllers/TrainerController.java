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

//    Get

    @GetMapping("/specific_trainer/{id}")
    Trainer getSpecificTrainer(@PathVariable("id") int id) {
//       x
        return trainerRepository.getSpecificTrainer(id);
//       x
    }

    @GetMapping("/all_trainers")
    public ResponseEntity<List<Trainer>> getAllTrainers() {

        List<Trainer> trainers = trainerRepository.findAll();

        return ResponseEntity
                .ok()
                .body(trainers);
    }

//    Post

    @PostMapping("/create_trainer")
    public ResponseEntity<Trainer> createTrainer(@RequestBody Trainer trainer) {
        Trainer result = trainerRepository.save(trainer);
        return ResponseEntity
                .ok()
                .body(result);
    }



}
