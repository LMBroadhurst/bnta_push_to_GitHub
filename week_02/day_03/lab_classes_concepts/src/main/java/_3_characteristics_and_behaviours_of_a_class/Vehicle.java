package _3_characteristics_and_behaviours_of_a_class;

public class Vehicle {

//    uml diagrams

    /*
        + - - - - - - - - - - - - - - +
        | Vehicle                     |  <- name of the class
        + - - - - - - - - - - - - - - +
        | kind: String                |  <- properties section/name
        + - - - - - - - - - - - - - - +
        | startEngine(): void         |  <- methods section/return type
        + - - - - - - - - - - - - - - +
     */


    String kind = "A hardcoded value of the 'kind' property.";

    void startEngine() {
        System.out.println("The engine has started!");
    }
}
