public abstract class FootballEmployee {

    protected String name;
    private int age;
    private int wage;

    public FootballEmployee(String name, int age, int wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String attendMeeting() {
        return this.name + " is bored.";
    }
}
