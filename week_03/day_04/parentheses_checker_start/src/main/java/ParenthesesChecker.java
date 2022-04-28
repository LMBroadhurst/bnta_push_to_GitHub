import java.util.ArrayList;
import java.util.Arrays;

public class ParenthesesChecker {

    boolean checkParentheses(String testString) {

        boolean allBracketsMatched = false;
        boolean bracketsMatched = false;
        boolean curlyBracketsMatched = false;
        boolean squareBracketsMatched = false;
        boolean arrowBracketsMatched = false;

        String[] splitTestString = testString.split("");

//        Testing brackets

        ArrayList<String> addBracketsHere = new ArrayList<>();

        for (String character: splitTestString) {
            if (character.equals("(") || character.equals(")")) {
                addBracketsHere.add(character);
            }
        }

        if (addBracketsHere.size() % 2 == 0) {
            bracketsMatched = true;
        }


        //        Testing square brackets

        ArrayList<String> addCurlyBracketsHere = new ArrayList<>();

        for (String character: splitTestString) {
            if (character.equals("[") || character.equals("]")) {
                addCurlyBracketsHere.add(character);
            }
        }

        if (addCurlyBracketsHere.size() % 2 == 0) {
            curlyBracketsMatched = true;
        }


        //        Testing  curly brackets

        ArrayList<String> addSquareBracketsHere = new ArrayList<>();

        for (String character: splitTestString) {
            if (character.equals("{") || character.equals("}")) {
                addSquareBracketsHere.add(character);
            }
        }

        if (addSquareBracketsHere.size() % 2 == 0) {
            squareBracketsMatched = true;
        }

        //        Testing arrow brackets

        ArrayList<String> addArrowBracketsHere = new ArrayList<>();

        for (String character: splitTestString) {
            if (character.equals("<") || character.equals(">")) {
                addArrowBracketsHere.add(character);
            }
        }

        if (addArrowBracketsHere.size() % 2 == 0) {
            arrowBracketsMatched = true;
        }

//        Combining statements

        if (squareBracketsMatched && curlyBracketsMatched && bracketsMatched && arrowBracketsMatched) {
            allBracketsMatched = true;
        }

        return allBracketsMatched;
    }
}
