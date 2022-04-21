package tddexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassUnderTheTestTest {

    ClassUnderTheTest classUnderTheTest = new ClassUnderTheTest();

    @Test
    void sleepIn_false_false() {
//        Given
        boolean firstParam = false;
        boolean secondParam = false;

//        When
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

//        Then
        assertTrue(actualValue);
    }

    @Test
    void sleepIn_true_false() {
//        Given
        boolean firstParam = true;
        boolean secondParam = false;

//        When
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

//        Then
        assertFalse(actualValue);
    }

    @Test
    void sleepIn_false_true() {
//        Given
        boolean firstParam = false;
        boolean secondParam = true;

//        When
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

//        Then
        assertTrue(actualValue);
    }

    @Test
    void sleepIn_true_true() {
//        Given
        boolean firstParam = true;
        boolean secondParam = true;

//        When
        boolean actualValue = classUnderTheTest.sleepIn(firstParam, secondParam);

//        Then
        assertTrue(actualValue);
    }

}

//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true
//        sleepIn(true, true) → true

