package generics_lab.exercise1;

public class Generics_Lab {

    public static void main(String[] args) {

//        Box with no Type set

        Box boxWithoutRestrictions = new Box();
        boxWithoutRestrictions.set("");
        boxWithoutRestrictions.set(1);
        boxWithoutRestrictions.set(false);

//       Box with type set to integer

        Box<Integer> boxForIntegersOnly = new Box();
//        boxForIntegersOnly.set("");
        boxForIntegersOnly.set(1);
//        boxForIntegersOnly.set(true);


    }

}
