package enclosures;

import animals.Bird;
import staff.Keeper;

public class BirdHouse extends Enclosure{

    public BirdHouse(String name, Keeper birdKeeper){
        super(name, birdKeeper);
    }

    public void addAnimal(Bird bird){
        this.animals.add(bird);
    }
}
