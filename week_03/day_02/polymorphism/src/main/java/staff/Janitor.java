package staff;

import animals.Animal;

public class Janitor extends Staff implements Feeder, Cleaner {

    public Janitor(String name) {
        super(name);
    }

    @Override
    public void feedAnimal(Animal animal) {

    }

    @Override
    public String cleanUp() {
        return null;
    }

    @Override
    public void goHomeAtEndOfDay() {

    }
}
