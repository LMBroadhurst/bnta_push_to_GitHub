package com.example.pokemonmanytomany.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Trainer {

//    Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String favourite_pokemon;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "relationships",
            joinColumns = @JoinColumn(name = "trainer_id"),
            inverseJoinColumns = @JoinColumn(name = "pokemon_id"))
    private Set<Pokemon> pokemons;


//    Constructors

    public Trainer() {}

    public Trainer(Long id, String name, int age, String favourite_pokemon, Set<Pokemon> pokemons) {
        this.name = name;
        this.age = age;
        this.favourite_pokemon = favourite_pokemon;
        this.pokemons = pokemons;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavourite_pokemon() {
        return favourite_pokemon;
    }

    public void setFavourite_pokemon(String favourite_pokemon) {
        this.favourite_pokemon = favourite_pokemon;
    }

    public Set<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Set<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
