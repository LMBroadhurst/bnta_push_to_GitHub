package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @GetMapping("/estates")
    public List<Estate> getAll() {
        return estateService.getAll();
    }

    @PostMapping("/estates")
    public Estate post(@RequestBody Estate estate) {
        return estateService.save(estate);
    }
}
