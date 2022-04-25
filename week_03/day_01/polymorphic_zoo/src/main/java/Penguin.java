public class Penguin extends Animal {

    public Penguin(String name, int age, String diet) {
        super(name, age, diet);
    }

    public String layEgg() {
        return "I laid an egg!";
    }

    public String introduce() {
        return "Hello there :)";
    }

}
