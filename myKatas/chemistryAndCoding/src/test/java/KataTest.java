import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void chemistryAndCoding__polar_polar() {
//        When
        boolean outputValue = Kata.chemistryAndCoding("Polar", "Polar");

//        Then
        assertEquals(true, outputValue);
    }

    @Test
    void chemistryAndCoding__polar_nonpolar() {
//        When
        boolean outputValue = Kata.chemistryAndCoding("Polar", "Non-Polar");

//        Then
        assertEquals(false, outputValue);
    }

    @Test
    void chemistryAndCoding__nonpolar_polar() {
//        When
        boolean outputValue = Kata.chemistryAndCoding("Non-Polar", "Polar");

//        Then
        assertEquals(false, outputValue);
    }

    @Test
    void chemistryAndCoding__nonpolar_nonpolar() {
//        When
        boolean outputValue = Kata.chemistryAndCoding("Non-Polar", "Non-Polar");

//        Then
        assertEquals(true, outputValue);
    }

    @Test
    void chemistryAndCoding__polar_polar_randCaps() {
//        Given
        String solvent = "PoLar".toLowerCase();
        String substrate = "polAR".toLowerCase();

//        When
        boolean outputValue = Kata.chemistryAndCoding(solvent, substrate);

//        Then
        assertEquals(true, outputValue);
    }

    @Test
    void chemistryAndCoding__nonpolar_nonpolar_randCaps() {
//        Given
        String solvent = "non-PoLar".toLowerCase();
        String substrate = "NOn-polAR".toLowerCase();

//        When
        boolean outputValue = Kata.chemistryAndCoding(solvent, substrate);

//        Then
        assertEquals(true, outputValue);
    }


}