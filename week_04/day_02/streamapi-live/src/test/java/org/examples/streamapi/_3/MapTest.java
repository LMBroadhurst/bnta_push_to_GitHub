package org.examples.streamapi._3;


import org.examples.streamapi.model.Person;
import org.examples.streamapi.model.PersonDTO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.examples.streamapi.TestUtil.PEOPLE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {

    @Test
    void mapPersonObjectsToStrings_comments() {
        List<String> names = PEOPLE
                .stream()
                .map(
                        (person) ->
                            person.getName()
                )
                .toList();
        // Certainly not the best way to check the returned list, but it will do for this case ;)
        assertEquals("Alec", names.get(0));
        assertEquals("Alivia", names.get(19));
        assertEquals(20, names.size());
    }

    @Test
    void mapPersonObjectsToStrings() {

        List<String> names = PEOPLE
                .stream()
                /*
                    The syntax can get even crazier - but this is just a syntax sugar!
                    It's the same as in the first example, so use the extended (the most obvious version)
                    and then use IntelliJ to get to the most straightforward ( at the beginning, the craziest) syntax.

                    ("Alec","Gunn", 20, MALE)
                 */

                .map(Person::getName)
                .toList();

        assertEquals("Alec", names.get(0));
        assertEquals("Alivia", names.get(19));
        assertEquals(20, names.size());
    }

/*
    Time for some practice:
     - map to List<Integers> (age)
     - map to List<String> (lastName)
     - map to List<Person.GENDER>
     extras: map List<Person> to List<PersonDTO>
 */

    @Test
    void mapPersonAges() {

        List<Integer> names = PEOPLE
                .stream()
                .map(Person::getAge)
                .toList();

        assertEquals(20, names.get(0));
        assertEquals(21, names.get(19));
        assertEquals(20, names.size());
    }

    @Test
    void mapPersonLastNames() {

        List<String> lastNames = PEOPLE
                .stream()
                .map(Person::getLastName)
                .toList();

        assertEquals("Gunn", lastNames.get(0));
        assertEquals("Parrish", lastNames.get(19));
        assertEquals(20, lastNames.size());
    }

    @Test
    void mapPersonGender() {

        List<Person.Gender> genders = PEOPLE
                .stream()
                .map(Person::getGender)
                .toList();

        assertEquals(Person.Gender.MALE, genders.get(0));
        assertEquals(Person.Gender.FEMALE, genders.get(19));
        assertEquals(20, genders.size());
    }

    @Test
    void mapPersonDTO() {

        List<PersonDTO> allPeople = PEOPLE
                .stream()
                .map(person -> new PersonDTO(person.getName(), person.getLastName()))
                .toList();
    }


}





