package afterHoursPractise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonitorTest {

    @BeforeEach
    void setup() {

    }

    @Test
    void brightnessUpSimple() {
//        Given
        Monitor test = new Monitor(130, "Samsung CR3700", true, 27, true, 50);
        // ^^ BeforeEach^^

//        When
        test.brightnessUp(10);

//       Then
        assertEquals(60, test.getBrightness());
    }

    @Test
    void brightnessUpAbove100() {
//        Given
        Monitor test = new Monitor(130, "Samsung CR3700", true, 27, true, 50);
        // ^^ BeforeEach^^

//        When
        test.brightnessUp(60);

//       Then
        assertEquals(50, test.getBrightness());
    }

    @Test
    void brightnessDownToFar() {
        //        Given
        Monitor test = new Monitor(130, "Samsung CR3700", true, 27, true, 50);
        // ^^ BeforeEach^^

//        When
        test.brightnessDown(60);

//       Then
        assertEquals(50, test.getBrightness());
    }

    @Test
    void brightnessDownTest() {
        //        Given
        Monitor test = new Monitor(130, "Samsung CR3700", true, 27, true, 50);
        // ^^ BeforeEach^^

//        When
        test.brightnessDown(5);

//       Then
        assertEquals(45, test.getBrightness());
    }


}

