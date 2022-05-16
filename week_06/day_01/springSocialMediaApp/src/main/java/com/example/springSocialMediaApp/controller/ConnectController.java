package com.example.springSocialMediaApp.controller;

import com.example.springSocialMediaApp.model.Connect;
import com.example.springSocialMediaApp.service.ConnectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConnectController {

    @Autowired
    private ConnectService connectService;

    @GetMapping("/connections")
    public List<Connect> getAll() {
        return connectService.getAll();
    }

}
