import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void mainAM1(String[] args) {

        for (int i = 1; i < 11; i++) {
//            Initial value - Termination condition - Incrementation on loop
//            The incrementation happens after each step, which means 11 isn't printed
            System.out.println(i);
//            sout is executed on each iteration and can be as complex as we like
        }
    }

    public static void mainAM2(String[] args) {

        ArrayList<String> footballTeams = new ArrayList<>();

        footballTeams.add("Manchester United");
        footballTeams.add("Arsenal FC");
        footballTeams.add("Tottenham Hotspur");

//        Initial value: 0
//        stop condition: length of array list
//        Increment: +1

//        for (int i = 0; i < footballTeams.size(); i++) {
//            System.out.println("My favourite top 4 bottler is " + footballTeams.get(i));
//        }
//
//        for (int i = 1; i < footballTeams.size(); i++) {
//            System.out.println(footballTeams.get(i));
//        }
//
//        for (int i = footballTeams.size() - 1; i >= 0; i--) {
//            System.out.println(footballTeams.get(i));
//        }
//
//        for (int i = footballTeams.size() - 1; i >= 0; i--) {
//            if (footballTeams.get(i).equals("Arsenal FC")) {
//                System.out.println("Big bottlers");
//            } else {
//                System.out.println("Bottler");
//            }
//        }
//
//        for (int i = footballTeams.size() - 1; i >= 0; i--) {
//            if (footballTeams.get(i).equals("Arsenal FC")) {
//                System.out.println("Big bottlers");
//                break;
//            } else {
//                System.out.println("Bottler");
//            }
//        }

//        ENHANCED for loop

//        for (String team : footballTeams) {
//            System.out.println("Name a bottler: " + team);
//        }


//        When looping through an ArrayList, we should avoid deleting items using the method.
//        Must keep this in mind when we are looping through an ArrayList.
//        Also applies to adding items through a list.

        for (int i = 0; i < footballTeams.size(); i++) {
            footballTeams.remove(i);
        }
        System.out.println(footballTeams);

    }

}

