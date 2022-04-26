import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefenderTest {

    @Test
    void tackle() {
//        Given
        Defender testDef = new Defender("DefenderTest", 27, 10000, 1, 0.07);

//        When

//        Then
        assertEquals("Slide Tackle.", testDef.tackle());
    }
}