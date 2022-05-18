package com.example.pokemonmanytomany.repository;

import com.example.pokemonmanytomany.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public class PokemonRepository extends JpaRepository<Pokemon, Long> {

}
