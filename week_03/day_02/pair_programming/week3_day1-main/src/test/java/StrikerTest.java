import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrikerTest {

    private Striker testStriker;

    @BeforeEach
    void setup() {
        testStriker = new Striker("TestStriker", 30, 105000, 10, 0.15);
    }

    @Test
    void shoot_lower() {
//        Given

//        When
        if(0.1 < testStriker.getShootingAccuracy()) {
            this.testStriker.setGoalsScored(testStriker.getGoalsScored() + 1);
        }

//        Then

        assertEquals(11, testStriker.getGoalsScored());
    }

    @Test
    void shoot_higher() {
//        Given

//        When
        if(0.2 < testStriker.getShootingAccuracy()) {
            this.testStriker.setGoalsScored(testStriker.getGoalsScored() + 1);
        }

//        Then

        assertEquals(10, testStriker.getGoalsScored());
    }

    @Test
    void testShoot__lower() {
//        Given

//        When
        if((0.05 * 2 ) < testStriker.getShootingAccuracy()) {
            this.testStriker.setGoalsScored(testStriker.getGoalsScored() + 1);
        }

//        Then
        assertEquals(11, testStriker.getGoalsScored());
    }

    @Test
    void testShoot__higher() {
//        Given

//        When
        if((0.2 * 2 ) < testStriker.getShootingAccuracy()) {
            this.testStriker.setGoalsScored(testStriker.getGoalsScored() + 1);
        }

//        Then
        assertEquals(10, testStriker.getGoalsScored());
    }
}