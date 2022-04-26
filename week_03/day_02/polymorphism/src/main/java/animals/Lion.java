package animals;

public class Lion extends Animal{

    private boolean canWaitToBeKing;

    public Lion(String name, int age, String diet, boolean canWaitToBeKing){
        super(name, age, diet);
        this.canWaitToBeKing = canWaitToBeKing;
    }

    // Getters & Setters

    public boolean isCanWaitToBeKing() {
        return canWaitToBeKing;
    }

    public void setCanWaitToBeKing(boolean canWaitToBeKing) {
        this.canWaitToBeKing = canWaitToBeKing;
    }

    // Behaviours

    @Override
    public String makeNoise(){
        return "Roar!";
    }

    public String makeNoise(String phrase) {
        return "Im going to say " + phrase;
    }

    public String makeNoise(int repeat) {
        System.out.println("Roar! " + repeat + " times.");
        return "roar";
    }

}
