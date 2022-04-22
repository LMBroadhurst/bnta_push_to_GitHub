package _5_this_getters_and_setters;

public class PersonClient {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Lewis");
        person1.setAge(70);
        person1.setMobile("0121 Do 1");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = new Person("Colin", "0121 242 5868", 69);
        System.out.println(person2);
    }

}
