package com.example.pokemonmanytomany.controllers;

import com.example.pokemonmanytomany.model.Pokemon;
import com.example.pokemonmanytomany.model.Trainer;
import com.example.pokemonmanytomany.repository.PokemonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokemonController {

//    Attributes

    private PokemonRepository pokemonRepository;


//     Constructors

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

//    Methods

    @GetMapping("/trainer/{id}")
    Trainer getPokemon(@PathVariable("id") int id) {
        return pokemonRepository.getPokemon(id);
    }

    @GetMapping("/all_pokemon")
    public ResponseEntity<List<Pokemon>> getAllPokemon() {

        List<Pokemon> pokemons = pokemonRepository.findAll();

        return ResponseEntity
                .ok()
                .body(pokemons);
    }

}
