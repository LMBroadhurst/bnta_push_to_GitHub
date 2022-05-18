package com.example.manyToMany;

import com.example.manyToMany.model.Lab;
import com.example.manyToMany.repository.LabRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class LabRepositoryTest {

    @Autowired
    private LabRepository labRepository;

    @Test
    void findByTitle_shouldReturnObject_whenTitleExists() {
        // Given the data.sql
        String existingTitle  = "HOW TO TRAIN GOLDFISH USING DOLPHIN TRAINING TECHNIQUES";

        // When
        Lab byTitle = labRepository.findByTitle(existingTitle);

        // Then
        assertEquals(existingTitle, byTitle.getTitle());
    }

    @Test
    void findByTitle() {
        // Given the data.sql
        String nonExistingTitle  = "HOW TO TRAIN GOLDFISH USING ELEPHANT TRAINING TECHNIQUES";

        // When
        Lab byTitle = labRepository.findByTitle(nonExistingTitle);

        // Then
        assertNull(byTitle);
    }

}
