import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalkeepersTest {

    @Test
    void tackle() {
//        Given
        Goalkeepers testGK = new Goalkeepers("GKTest", 27, 10000, 1, 0.02);

//        When

//        Then
        assertEquals("Great Save.", testGK.tackle());
    }
}