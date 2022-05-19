package com.example.pokemonmanytomany.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pokemon {

//    Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int level;
    private String favourite_move;

    @ManyToMany(mappedBy = "pokemons", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "pokemons")
    private Set<Trainer> trainers;


//    Constructors

    public Pokemon() {}

    public Pokemon(Long id, String name, int level, String favourite_move, Set<Trainer> trainers) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.favourite_move = favourite_move;
        this.trainers = trainers;
    }


//    Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFavourite_move() {
        return favourite_move;
    }

    public void setFavourite_move(String favourite_move) {
        this.favourite_move = favourite_move;
    }

    public Set<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(Set<Trainer> trainers) {
        this.trainers = trainers;
    }
}
