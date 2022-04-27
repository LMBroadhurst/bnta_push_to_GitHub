package org.example_generics.firstExercise;

public class MyGenericClass <P, R> {

    public void useGenerics (P p, R r) {
        System.out.println("The P type is: " + p);
        System.out.println("The R type is: " + r);
    }

}
