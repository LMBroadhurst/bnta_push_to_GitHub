package com.example.pokemonmanytomany.repository;

import com.example.pokemonmanytomany.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
