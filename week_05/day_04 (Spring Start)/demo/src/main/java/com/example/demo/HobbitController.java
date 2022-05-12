package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
        Annotations add some superpowers to plain Java code.
        @RestController:
        -Spring will create a bean from this class
        -we can define endpoint methods in this class

 */
@RestController
public class HobbitController {

    // Create, Read, Update, Delete = HTTP POST, GET, PUT, DELETE

    // Our fake db - create a list of hobbits
    private List<Hobbit> hobbits;
    public HobbitController() {
        hobbits = new ArrayList<>();
        hobbits.add( new Hobbit("Frodo", "Baggins"));
        hobbits.add( new Hobbit("Bilbo", "Baggins"));
        hobbits.add(  new Hobbit("Gandalf", "Grey"));
    }


    // Accept HTTP GET, localhost:8080/hobbits
    @GetMapping("/hobbits")
    List<Hobbit> getAll() {
        return hobbits;
    }

    // ############   Extra Part! ############# //


    // Accept HTTP POST, localhost:8080/hobbits
    @PostMapping("/hobbits")
    Hobbit post(@RequestBody Hobbit hobbit){
        /*
                Add a new Hobbit to the list.
         */
        hobbits.add(hobbit);
        // Return the last hobbit from the list
        return hobbits.get(hobbits.size()-1);
    }

    // Accept HTTP DELETE, localhost:8080/hobbits
    @DeleteMapping("/hobbits/{id}")
    void delete(@PathVariable int id){
        hobbits.remove(id);
    }

}
