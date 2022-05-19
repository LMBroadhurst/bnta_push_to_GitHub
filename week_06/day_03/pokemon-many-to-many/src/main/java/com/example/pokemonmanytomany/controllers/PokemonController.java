package com.example.pokemonmanytomany.controllers;

import com.example.pokemonmanytomany.model.Pokemon;
import com.example.pokemonmanytomany.repository.PokemonRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/specific_pokemon/{id}")
    Pokemon getSpecificPokemon(@PathVariable("id") int id) {
//        x
        return pokemonRepository.getSpecificPokemon(id);
//        x
    }

    @GetMapping("/all_pokemon")
    public ResponseEntity<List<Pokemon>> getAllPokemon() {

        List<Pokemon> pokemons = pokemonRepository.findAll();

        return ResponseEntity
                .ok()
                .body(pokemons);
    }


    //    Post

    @PostMapping("/create_pokemon")
    public ResponseEntity<Pokemon> createPokemon(@RequestBody Pokemon pokemon) {
        Pokemon result = pokemonRepository.save(pokemon);
        return ResponseEntity
                .ok()
                .body(result);
    }

//    Delete

    @DeleteMapping("/delete_pokemon/{id}")
    void deleteSpecificPokemon(@PathVariable("id") Long id) {
        pokemonRepository.deleteById(id);
    }

}
