package com.example.springWebDB.service;

import com.example.springWebDB.model.Hobbit;
import com.example.springWebDB.repository.HobbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbitService {

    @Autowired
    public HobbitRepository hobbitRepository;

    public List<Hobbit> getAll() {
        return hobbitRepository.findAll();
    }

    public Hobbit save(Hobbit hobbit) {
        return hobbitRepository.save(hobbit);
    }
}
