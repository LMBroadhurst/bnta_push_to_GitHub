package animals;

public class Lion extends Animal {

    boolean canWaitToBeKing;

    public Lion(String name, int age, String diet, boolean canWaitToBeKing) {
        super(name, age, diet);
        this.canWaitToBeKing = canWaitToBeKing;
    }

//    Getters and Setters

    public boolean isCanWaitToBeKing() {
        return canWaitToBeKing;
    }

    public void setCanWaitToBeKing(boolean canWaitToBeKing) {
        this.canWaitToBeKing = canWaitToBeKing;
    }

//    Behaviours

    @Override
    public String makeNoise() {
        return "Roar";
    }

    public String introduce() {
        return "Hi there, my name is " + this.name;
    }

    public void reproduce() {
        System.out.println("Try for baby.");
    }
}
