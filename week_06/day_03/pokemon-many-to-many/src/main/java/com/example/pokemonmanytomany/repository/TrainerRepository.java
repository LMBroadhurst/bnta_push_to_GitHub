package com.example.pokemonmanytomany.repository;

import com.example.pokemonmanytomany.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {

    @Query(value = "SELECT * FROM trainer WHERE id = ?",
           nativeQuery = true)
    Trainer getSpecificTrainer(int id);

}
