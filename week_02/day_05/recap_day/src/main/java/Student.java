public class Student {

    private String name;
    private String location;
    private String university;
    private int age;


//    Create the constructor - must always be public.
    public Student(String name, int age, String location, String university){
        this.name = name;
        this.age = age;
        this.location = location;
        this.university = university;
    }

//    Getters and Setters
//    Need to be public. The point of getters and setters is that we can access them from outside the class.
//    Getters have to return the value of the property.

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    Behaviours

    public boolean livesInLondon() {
        if (this.location.equals("London")) {
            return true;
        } else {
            return false;
        }
    }

    public void countToTen() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public void countToNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }



}
