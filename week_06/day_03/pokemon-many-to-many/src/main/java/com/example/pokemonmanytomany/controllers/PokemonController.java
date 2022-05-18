package com.example.pokemonmanytomany.controllers;

import com.example.pokemonmanytomany.repository.PokemonRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

//    Attributes

    private PokemonRepository pokemonRepository;


//     Constructors

    public PokemonController() {}

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

//    Methods

}
