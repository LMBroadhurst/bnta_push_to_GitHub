package generics_youtube.reinforcing_generics;

public class Printer<T extends Animal> {

//    Standard convention is T, which stands for Type.
//    This represents the type of thing that the printer can hold and print.

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
        thingToPrint.eat();
    }

//    Notice how we have 1 class that does the job of the 3 distinct printer classes, simplifying our code and
//    reducing the number of times we repeat ourselves.

}
