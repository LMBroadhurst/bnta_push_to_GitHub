package org.example.streamapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MVP {

//    Convert a List<String> to an object stream and for each element -> System,out.println.

    public void printNames(List<String> names) {
        names.forEach(System.out::println);
    }

//        Given a List<Integers>, return a List<Integer> with event numbers.

    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .toList();

        return evenNumbers;
    }


    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        return numbers;
    }


    /*
        Given a String, return a List<String>, all caps.
     */

    public List<String> splitToAllCapsList(String input) {

        Predicate<String> toCaps = letter -> letter.toUpperCase();

        return;
    }






    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {

        Predicate<String> filterByFirstLetter = string -> string.startsWith(letter);
//
//        list.forEach(
//                (letter) -> {}
//        );

//        List<String> filteredList = list
//                .stream()
//                .filter(filterByFirstLetter)
//                .forEach(string -> string.toUpperCase());

        return list;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        return null;
    }
}