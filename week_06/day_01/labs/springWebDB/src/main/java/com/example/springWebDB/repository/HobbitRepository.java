package com.example.springWebDB.repository;

import com.example.springWebDB.model.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;

// Extends JpaRepository is the "superpower"
public interface HobbitRepository extends JpaRepository<Hobbit, Long> {
}
