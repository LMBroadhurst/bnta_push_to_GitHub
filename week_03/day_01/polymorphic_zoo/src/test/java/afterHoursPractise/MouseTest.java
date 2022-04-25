package afterHoursPractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MouseTest {

    @Test
    void click() {
//        Given
        Mouse test = new Mouse(10, "testMouse", true, 5, "static");

//        When
        test.click();

//        Then
        assertEquals("Click!", test.click());

    }
}