package com.example.pokemonmanytomany.repository;

import com.example.pokemonmanytomany.model.Pokemon;
import com.example.pokemonmanytomany.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

     @Query(value = "SELECT * FROM pokemon WHERE id = ?",
            nativeQuery = true)
    Pokemon getSpecificPokemon(int id);

    @Query(value = "DELETE FROM pokemon WHERE id = ?",
            nativeQuery = true)
    Pokemon deleteSpecificPokemon(int id);

}
