package _2_test_with_junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Service2Test {

    @Test
    @DisplayName("When calling hello('String Lewis') on a Service2 object we should get 'Hello, Lewis.")
    void hello() {
//        fail() - will fail the test

//        Given     an object of type Service2
        Service2 service = new Service2();
        String expectedValue = "Hello, Lewis!";

//        When      hello is called with "Lewis"
        String actualValue = service.hello("Lewis");

//        Then      it should return "Hello, Lewis!"
        assertEquals(expectedValue, actualValue);

    }
}