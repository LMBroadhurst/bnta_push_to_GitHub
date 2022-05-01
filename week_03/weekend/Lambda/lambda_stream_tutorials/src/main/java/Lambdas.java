public class Lambdas {

    public static void main(String[] args) {

//        Cat myCat = new Cat("Lewis", 27);

//        printThing(
//             () -> System.out.println("Meow"));

        Printable lambdaPrintable = (suffix) -> {
            System.out.println("Meow " + suffix);
            return "Meow";
        };

       lambdaPrintable.print("milk");

//       We create a new Printable object and assign it to the variable name: lambdaPrintable.
//       The object lambdaPrintable now directly implements the method how we want it to.
//       Note the Printable interface must be a SAM - Single Abstract Method, Interface.
//       After we call the variable, we can then directly implement a method.
//       The method is now an object.

        Printable lewisLambda = suffix -> {
            System.out.println("Meow " + suffix);
            return "A";
        };
        
        Printable attempt2 = (suffix) -> {
            System.out.println("Ouch, my " + suffix);
            return "a";
        };

        attempt2.print("Ass!");


    }

    static void printThing(Printable thing) {
        thing.print("!");
    }
}
