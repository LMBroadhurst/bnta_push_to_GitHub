package _2_class_vs_object_and_constructors;

public class Vehicle {

//    A constructor cannot be static.
//    A constructor will always use a capital letter.
//    They do not declare a return type.
//    The name of the constructor needs to be the same as the class it is within.
//    new Vehicle() - this is a constructor, it is a special method that constructs objects within a class.

    public Vehicle() {
        System.out.println("No-arg constructor, a hardcoded message.");
    }

    public Vehicle(String message) {
        System.out.println(message);
    }

}
