package animals;

public abstract class Animal {

    protected String name;
    private String diet;
    private int age;

    public Animal(String name, int age, String diet) {
        this.name = name;
        this.age = age;
        this.diet = diet;
    }

//    Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    Behaviours

    public String eat() {
        return "Mmmm, tasty " + this.diet;
    }

    public String sleep() {
        return "Zzz...";
    }

    public String makeNoise() {
        return "Noot noot";
    }

    public String introduce() {
        return "My name is " + this.name;
    }

    public abstract void reproduce();

}
