package enclosures;

import animals.Animal;

import java.util.ArrayList;

public abstract class Enclosure {

    private String name;
    private boolean open;
    protected ArrayList<Animal> animals;

    public Enclosure(String name) {
        this.name = name;
        this.open = false;
        this.animals = new ArrayList<>();
    }

    public int countAnimals() {
        return this.animals.size();
    }

    public void open() {
        this.open = true;
    }

    public void close() {
        this.open = false;
    }


}
