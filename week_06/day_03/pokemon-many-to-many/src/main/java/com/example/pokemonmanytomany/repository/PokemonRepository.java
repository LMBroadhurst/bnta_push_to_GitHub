package com.example.pokemonmanytomany.repository;

import com.example.pokemonmanytomany.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
