package com.example.pokemonmanytomany.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PokemonRepositoryTest {

    @Autowired
    PokemonRepository pokemonRepository;

    @Test
    void getSpecificPokemon() {
//        Given

//        When

//        Then
    }

    @Test
    void deleteSpecificPokemon() {
//        Given
        Long existingId = 1l;
        assertEquals(5, pokemonRepository.findAll().size());

//        When
        pokemonRepository.deleteById(existingId);

//        Then
        assertEquals(4, pokemonRepository.findAll().size());

    }
}