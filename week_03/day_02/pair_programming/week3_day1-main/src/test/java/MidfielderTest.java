import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MidfielderTest {

    private Midfielder testMidfielder;

    @BeforeEach
    void setup() {
        testMidfielder = new Midfielder("TestMidfielder", 30, 105000, 10, 0.15);
    }

    @Test
    void tackle() {
//        Given
        testMidfielder = new Midfielder("MidTest", 27, 10000, 1, 0.1);

//        When

//        Then
        assertEquals("Standing up tackle.", testMidfielder.tackle());
    }

    @Test
    void shoot_lower() {
//        Given

//        When
        if(0.1 < testMidfielder.getShootingAccuracy()) {
            this.testMidfielder.setGoalsScored(testMidfielder.getGoalsScored() + 1);
        }

//        Then

        assertEquals(11, testMidfielder.getGoalsScored());
    }

    @Test
    void shoot_higher() {
//        Given

//        When
        if(0.2 < testMidfielder.getShootingAccuracy()) {
            this.testMidfielder.setGoalsScored(testMidfielder.getGoalsScored() + 1);
        }

//        Then

        assertEquals(10, testMidfielder.getGoalsScored());
    }

    @Test
    void testShoot__lower() {
//        Given

//        When
        if((0.05 * 2 ) < testMidfielder.getShootingAccuracy()) {
            this.testMidfielder.setGoalsScored(testMidfielder.getGoalsScored() + 1);
        }

//        Then
        assertEquals(11, testMidfielder.getGoalsScored());
    }

    @Test
    void testShoot__higher() {
//        Given

//        When
        if((0.2 * 2 ) < testMidfielder.getShootingAccuracy()) {
            this.testMidfielder.setGoalsScored(testMidfielder.getGoalsScored() + 1);
        }

//        Then
        assertEquals(10, testMidfielder.getGoalsScored());
    }

}