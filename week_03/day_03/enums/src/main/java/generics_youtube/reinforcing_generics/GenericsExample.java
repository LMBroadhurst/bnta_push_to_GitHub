package generics_youtube.reinforcing_generics;

import generics_youtube.reinforcing_generics.Cat;
import generics_youtube.reinforcing_generics.Printer;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        Printer<Cat> catPrinter = new Printer<>(new Cat());
        catPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.print();

//        Printer<Integer> intPrinter = new Printer<>(12);
//        intPrinter.print();

//        We cannot use the integer type anymore, as it does not come under the Animal class.
//        Or any other type for that matter.

        shout("Lewis", 74);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(intList);


    }

    public static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!!");
        System.out.println(otherThingToShout + "!!!");
    }

    private static void printList(List<?> myList) {
        System.out.println();
    }

//    We can use ? as our list parameter when we do not know what will be passed into our list.
//    This makes it a WILDCARD.




}
