import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal animal;

    @BeforeEach
    void setup() {
        animal = new Animal("Pingu", 36, "Penguin", "Fish");
    }

    @Test
    void canEatSomething() {
//        Given - an animal
//        When - it eats something
//        Then - the expected string is returned
        assertEquals("Mmmm, tasty Fish", animal.eat());
    }

    @Test
    void canSleep() {
        assertEquals("Zzz...", animal.sleep());
    }

    @Test
    void canMakeNoise() {
        assertEquals("Noot noot", animal.makeNoise());
    }

}