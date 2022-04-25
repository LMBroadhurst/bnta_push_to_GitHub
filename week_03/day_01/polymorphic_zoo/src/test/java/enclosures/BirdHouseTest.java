package enclosures;

import animals.Bird;
import animals.Parrot;
import animals.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdHouseTest {

    @Test
    void canCountAnimals() {
        BirdHouse birdHouse = new BirdHouse("Test bHouse");
        assertEquals(0, birdHouse.countAnimals());

    }

    @Test
    void canAddDifferentBirds() {
        BirdHouse birdHouse = new BirdHouse("Test bHouse");
        Penguin penguin = new Penguin("Pingu", 36, "Fish");
        Parrot parrot = new Parrot("Polly", 25, "Seeds");

        birdHouse.addAnimal(parrot);
        birdHouse.addAnimal(penguin);

        assertEquals(2, birdHouse.countAnimals());
    }
}