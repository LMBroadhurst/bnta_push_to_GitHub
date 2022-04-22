package _2_class_vs_object_and_constructors;

public class Main {

    public static void main(String[] args) {

//        When we create constructors, we should create a no arg constructor alongside out other constructors
//        even if we do not use it.

//        vehicle1 is created using a no-arg constructor
        Vehicle vehicle1 = new Vehicle();

//        vehicle2 is created using a constructor with a String parameter.
        Vehicle vehicle2 = new Vehicle("A message passed to a constructor!");

    }



}
