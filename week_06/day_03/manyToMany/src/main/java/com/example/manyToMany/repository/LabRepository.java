package com.example.manyToMany.repository;

import com.example.manyToMany.model.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<Lab, Long> {

    Lab findByTitle(String title);

}
