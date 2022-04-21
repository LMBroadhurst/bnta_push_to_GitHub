package tddexercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonkeyTroubleTest {

    MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

    @Test
    void monkeyTrouble_true_true() {
//        When
        boolean firstParam = true;
        boolean secondParam = true;

//        Given
        boolean actualValue = monkeyTrouble.monkeyTrouble(firstParam, secondParam);

//        Then
        assertTrue(actualValue);
    }

    @Test
    void monkeyTrouble_false_false() {
//        When
        boolean firstParam = false;
        boolean secondParam = false;

//        Given
        boolean actualValue = monkeyTrouble.monkeyTrouble(firstParam, secondParam);

//        Then
        assertTrue(actualValue);
    }

    @Test
    void monkeyTrouble_true_false() {
//        When
        boolean firstParam = true;
        boolean secondParam = false;

//        Given
        boolean actualValue = monkeyTrouble.monkeyTrouble(firstParam, secondParam);

//        Then
        assertFalse(actualValue);
    }
}

//        monkeyTrouble(true, true) → true
//        monkeyTrouble(false, false) → true
//        monkeyTrouble(true, false) → false