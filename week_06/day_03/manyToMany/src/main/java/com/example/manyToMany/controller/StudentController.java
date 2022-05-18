package com.example.manyToMany.controller;

import com.example.manyToMany.model.Student;
import com.example.manyToMany.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController() {}

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students_1")
    public ResponseEntity<List<Student>> getAllStudents() {

        List<Student> students = studentRepository.findAll();

        return ResponseEntity
                .ok()
                .body(students);
    }

    @GetMapping("/students_2")
    public ResponseEntity<List<Student>> getAllStudents(@RequestParam(required = false, defaultValue = "false")
    boolean orderedByLastName) {

        List<Student> students;
        if (orderedByLastName) {
            students = studentRepository.findAllOrdered();
        } else {
            students = studentRepository.findAll();
        }
        return ResponseEntity
                .ok()
                .body(students);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student result = studentRepository.save(student);
        return ResponseEntity
                .ok()
                .body(result);
    }

}
