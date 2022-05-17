package com.bnta.chocolate.controller;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping("/chocolates")
    public List<Chocolate> getAll() {
        return chocolateService.getAll();
    }

    @GetMapping("/singleChocolate")
    public Chocolate getChocolate1() {
        return chocolateService.getAll().get(0);
    }

    @PostMapping("/chocolates")
    public Chocolate post(@RequestBody Chocolate chocolate) {
        return chocolateService.save(chocolate);
    }



}
