package org.example_generics.customclass;

public class GenericClass <P, R> {

    public void useGenerics(P p, R r) {
        System.out.println("The P type is: " + p.getClass());
        System.out.println("The R type is: " + r);
    }
}
