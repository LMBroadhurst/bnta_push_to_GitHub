package com.example.springSocialMediaApp.service;

import com.example.springSocialMediaApp.model.Connect;
import com.example.springSocialMediaApp.repository.ConnectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectService {

    @Autowired
    private ConnectRepository connectRepository;

    public List<Connect> getAll() {
        return connectRepository.findAll();
    }
}
