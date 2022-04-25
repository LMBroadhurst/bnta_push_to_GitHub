package enclosures;

import animals.Animal;
import animals.Bird;

import java.util.ArrayList;

public class BirdHouse extends Enclosure{

    public BirdHouse(String name) {
        super(name);
    }

    public void addAnimal(Bird bird) {
        this.animals.add(bird);
    }

}
