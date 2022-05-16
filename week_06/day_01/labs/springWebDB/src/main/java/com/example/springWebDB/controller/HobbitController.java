package com.example.springWebDB.controller;

import com.example.springWebDB.model.Hobbit;
import com.example.springWebDB.service.HobbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbitController {

//    Autowired glues different objects together
    @Autowired
    private HobbitService hobbitService;

    @GetMapping ("/hobbits")
    public List<Hobbit> getAll() {
        return hobbitService.getAll();
    }

    @PostMapping ("/hobbits")
    Hobbit post(@RequestBody Hobbit hobbit) {
//        POST: client will take data and create a hobbit object
        return hobbitService.save(hobbit);
    }

}
