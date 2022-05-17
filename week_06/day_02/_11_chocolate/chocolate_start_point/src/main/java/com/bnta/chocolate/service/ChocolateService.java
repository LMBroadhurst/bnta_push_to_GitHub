package com.bnta.chocolate.service;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateService {

    @Autowired
    private ChocolateRepository chocolateRepository;

    public List<Chocolate> getAll() {
        return chocolateRepository.findAll();
    }

    public Chocolate save(Chocolate chocolate) {
        return chocolateRepository.save(chocolate);
    }

}
