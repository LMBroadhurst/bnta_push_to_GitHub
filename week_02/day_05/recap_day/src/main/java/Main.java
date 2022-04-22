public class Main {

    public static void main(String[] args) {

//        Call the constructor function - instantiates the object.
//        Student defaultStudent = new Student();

        Student student1 = new Student("Edward", 24, "St Albans", "Newcastle");

        student1.setName("Lewis");
        student1.setLocation("London");
        student1.setAge(27);

        String student1Name = student1.getName();
        String student1Location = student1.getLocation();
        int student1Age = student1.getAge();

        System.out.println(student1Name);
        System.out.println(student1Location);
        System.out.println(student1Age);

        student1.countToTen();

        student1.countToNumber(6);

        System.out.println(student1.livesInLondon());

        if (student1.livesInLondon()) {
            System.out.println("Eligible for scholarship.");
        } else {
            System.out.println("Source outside funding.");
        }

        Cohort cohort = new Cohort("T-Techs");
        cohort.addNewStudent(student1);
        System.out.println(cohort.countStudents());


//        Calculator code

        Calculator.add(2, 3);
    }
}
