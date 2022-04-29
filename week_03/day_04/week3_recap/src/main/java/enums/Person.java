package enums;

public class Person {

    private String name;
    private String homeTown;
    private Month birthMonth;

    public Person(String name, String homeTown, Month birthMonth) {
        this.name = name;
        this.homeTown = homeTown;
        this.birthMonth = birthMonth;
    }

//    Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Month getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Month birthMonth) {
        this.birthMonth = birthMonth;
    }
}
