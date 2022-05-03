package org.examples.streamapi._1;

import org.junit.jupiter.api.Test;

import static org.examples.streamapi.TestUtil.PEOPLE;

public class ForEachTest {
    @Test
    void printOutNamesAllCaps_comments(){
        PEOPLE
                .forEach(
                      /*
                        To help you understand the lambda's syntax
                        You may start with this and use IntelliJ to simplify the expression.
                     */
                        (person) -> {
                            System.out.println(person.getName().toUpperCase());
                        }
                );
    }

    @Test
    void printOutAllCaps(){
        PEOPLE.forEach(person -> System.out.println(person.getName().toUpperCase()));
    }

    // Time for some practice: print out, in separate tests: lastName, age, Gender.

    @Test
    void printOutAllLastNames() {
        PEOPLE
                .forEach(
                        (person) -> {
                            System.out.println(person.getLastName());
                        }
                );
    }

    @Test
    void printAges() {
        PEOPLE
                .forEach(
                        person -> System.out.println(person.getAge())
                );
    }

    @Test
    void printGenders() {
        PEOPLE.forEach(person -> System.out.println(person.getGender()));
    }

    @Test
    void getFirstName() {
        PEOPLE.forEach(person -> System.out.println(person.getName()));
    }

    @Test
    void getLastName() {
        PEOPLE.forEach(person -> System.out.println(person.getLastName()));
    }
}
