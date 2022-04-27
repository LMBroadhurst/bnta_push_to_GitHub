package org.example_generics.customclass;

import org.example_generics.list.Person;

public class Main {

    public static void main(String[] args) {
        GenericClass<Person, String> genericClassRefVariable = new GenericClass<>();

        genericClassRefVariable.useGenerics(new Person(), "String");
    }

}
