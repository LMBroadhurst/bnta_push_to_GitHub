package _5_this_getters_and_setters;

public class Person {

//    characteristics
//    Start with our characteristics as private, only make them public when we have a good reason to do so.

    private String name;
    private String mobile;
    private int age;

    public Person() {
    }

    public Person(String name, String mobile, int age) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
//        if(mobile.isEmpty()) {
//
//        }
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                '}';
    }


}
