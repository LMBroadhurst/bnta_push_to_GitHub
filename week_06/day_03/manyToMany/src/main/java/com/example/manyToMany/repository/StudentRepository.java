package com.example.manyToMany.repository;

import com.example.manyToMany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT * FROM STUDENT ORDER BY LAST_NAME", nativeQuery = true)
    List<Student> findAllOrdered();

}
