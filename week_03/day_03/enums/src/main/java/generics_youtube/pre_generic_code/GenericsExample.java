package generics_youtube.pre_generic_code;

public class GenericsExample {

    public static void main(String[] args) {

        IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();

        StringPrinter sPrinter = new StringPrinter("Hey");
        sPrinter.print();

        DoublePrinter dPrinter = new DoublePrinter(1.13);
        dPrinter.print();
    }

//    The problem with coding like this is that if we want to do the exact same thing but for doubles,
//    we need to copy and paste the exact same code and repeat ourselves.

//    Now we have made a String and Double printer. So we have 3 of the exact same classes doing the exact same things.
//    To make this into a more efficient code base, we can use generics.

}
