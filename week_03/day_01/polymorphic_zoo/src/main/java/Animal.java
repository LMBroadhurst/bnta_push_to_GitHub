public class Animal {

    private String name;
    private String specie;
    private String diet;
    private int age;

    public Animal(String name, int age, String specie, String diet) {
        this.name = name;
        this.age = age;
        this.specie = specie;
        this.diet = diet;
    }

//    Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
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

}
