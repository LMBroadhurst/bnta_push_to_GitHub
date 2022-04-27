package generics_youtube.pre_generic_code;

public class DoublePrinter {

    double thingToPrint;

    public DoublePrinter(double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    //    The problem with coding like this is that if we want to do the exact same thing but for doubles,
//    we need to copy and paste the exact same code and repeat ourselves.

//    Now we have made a String and Double printer. So we have 3 of the exact same classes doing the exact same things.
//    To make this into a more efficient code base, we can use generics.

}
