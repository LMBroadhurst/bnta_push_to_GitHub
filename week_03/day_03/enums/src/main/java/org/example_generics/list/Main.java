package org.example_generics.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Non-generic list accepts any variables.
        List nonGenericList = new ArrayList<>();

        nonGenericList.add(1);
        nonGenericList.add("String");
        nonGenericList.add(new Person());

        Object object = nonGenericList.get(1);
        Person person = (Person) object;
        person.personMethod();

//        Generic List does not accept non-object variables here.
        ArrayList<Person> personTypeOnly = new ArrayList<>();
//        personTypeOnly.add(1);
        personTypeOnly.add(new Person());
//        personTypeOnly.add("String");


    }

}
