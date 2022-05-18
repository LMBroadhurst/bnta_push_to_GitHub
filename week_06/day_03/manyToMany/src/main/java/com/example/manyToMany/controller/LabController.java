package com.example.manyToMany.controller;

import com.example.manyToMany.model.Lab;
import com.example.manyToMany.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LabController {

//    The right way to inject dependencies

    private LabRepository labRepository;

    public LabController(LabRepository labRepository) {
        this.labRepository = labRepository;
    }

    @GetMapping("/labs")
    public ResponseEntity<List<Lab>> getAllLabs() {
        List<Lab> labs = labRepository.findAll();
        return ResponseEntity
                .ok()
                .body(labs);
    }

    @PostMapping("/labs")
    public ResponseEntity<Lab> createLab(@RequestBody Lab lab) {
        Lab result = labRepository.save(lab);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/labs/{title}")
    public ResponseEntity<Lab> getByTitle(@PathVariable String title) {
        Lab lab = labRepository.findByTitle(title);
        return ResponseEntity
                .ok()
                .body(lab);
    }


}
