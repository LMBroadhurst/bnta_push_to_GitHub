package com.bnta.chocolate.config;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBseeder implements ApplicationRunner {

    @Autowired
    private EstateRepository estateRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate estate1 = new Estate("Kenya County", "Kenya");
        Estate estate2 = new Estate("Birmingham Chocolate Brewers", "UK");
        Estate estate3 = new Estate("Donkey Kongs Chocolate", "Mario World");
        Estate estate4 = new Estate("Jack Sparrows Dairy", "The Black Pearl");
        Estate estate5 = new Estate("Willy Wonkas Chocolate Factory", "Antarctica");

        Chocolate choc1 = new Chocolate("Big L", 50, estate1);
        Chocolate choc2 = new Chocolate("Dirty Drifters", 30, estate1);
        Chocolate choc3 = new Chocolate("Kenyas Finest", 52, estate1);
        Chocolate choc4 = new Chocolate("Just a chocolate bar", 29, estate2);
        Chocolate choc5 = new Chocolate("Marios Muffin Bar", 71, estate3);
        Chocolate choc6 = new Chocolate("Donkey Donuts", 15, estate3);
        Chocolate choc7 = new Chocolate("Chocolate Peach", 50, estate3);
        Chocolate choc8 = new Chocolate("Because they R", 44, estate4);
        Chocolate choc9 = new Chocolate("Dazzling Dippers", 22, estate5);
        Chocolate choc10 = new Chocolate("Curious Chocolate", 51, estate5);

        estate1.setChocolates(List.of(choc1, choc2, choc3));
        estate2.setChocolates(List.of(choc4));
        estate3.setChocolates(List.of(choc5, choc6, choc7));
        estate4.setChocolates(List.of(choc8));
        estate5.setChocolates(List.of(choc9, choc10));

        estateRepository.saveAll(List.of(estate1, estate2, estate3, estate4, estate5));
    }
}
