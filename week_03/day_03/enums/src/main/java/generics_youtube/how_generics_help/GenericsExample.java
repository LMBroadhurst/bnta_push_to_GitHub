package generics_youtube.how_generics_help;

import java.util.ArrayList;

public class GenericsExample {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(23.22);
        doublePrinter.print();

//    Notice how we have 1 class that does the job of the 3 distinct printer classes, simplifying our code and
//    reducing the number of times we repeat ourselves.

//        ArrayList<Object> cats = new ArrayList<>();
//        cats.add(new Cat());
//
//        Cat myCat = (Cat) cats.get(0);

//        The above code works because we can typecast the object into a cat, which is fine.

//        The problem is, if we then try to add a dog to the list, we get no type error, as the dog is cast as a cat.
//        When we run our code, we will encounter an error though.

//        cats.add(new Dog());
//
//        Cat myCat = (Cat) cats.get(0);

//        Find the errors that are created by this by running the above code.

//        Using Generics to help us...

        ArrayList<Cat> cats = new ArrayList<>();
//        Create an array list which will contain only Cat objects.

        cats.add(new Cat());
//        Now we can only add Cat objects into this array list. Everything else will give an error.

        Cat myCat = cats.get(0);
//        Now we do not have to use type casting, because Java knows for sure that the ArrayList only contains
//        Cat objects :)

    }




}
