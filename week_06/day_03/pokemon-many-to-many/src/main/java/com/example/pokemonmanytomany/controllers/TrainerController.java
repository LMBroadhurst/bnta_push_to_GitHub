package com.example.pokemonmanytomany.controllers;

import com.example.pokemonmanytomany.repository.TrainerRepository;
import org.springframework.web.bind.annotation.RestController;

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



}
