import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ParenthesesChecker {

    boolean checkParentheses(String testString) {

        boolean allBracketsMatched = false;
        boolean bracketsMatched = false;
        boolean curlyBracketsMatched = false;
        boolean squareBracketsMatched = false;
        boolean arrowBracketsMatched = false;
        boolean bracketsMatchedCorrectly = true;

        String[] splitTestString = testString.split("");

        Stack<String> allBracketsStack = new Stack<>();

//        Testing brackets

        ArrayList<String> addBracketsHere = new ArrayList<>();

        for (String character: splitTestString) {
            if (character.equals("(") || character.equals(")")) {
                addBracketsHere.add(character);
                allBracketsStack.push(character);
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
                allBracketsStack.push(character);
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
                allBracketsStack.push(character);
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
                allBracketsStack.push(character);
            }
        }

        if (addArrowBracketsHere.size() % 2 == 0) {
            arrowBracketsMatched = true;
        }

//        Combining statements

        if (squareBracketsMatched && curlyBracketsMatched && bracketsMatched && arrowBracketsMatched) {
            allBracketsMatched = true;
        }

//        Last test to check if pairs are properly matched.

        System.out.println(allBracketsStack);

        if (allBracketsStack.size() > 3 && allBracketsStack.get(0) != (allBracketsStack.get(1))) {

            if (allBracketsStack.get(1).equals(allBracketsStack.get(2))) {
                allBracketsMatched = true;
            } else {
                allBracketsMatched = false;
            }
        }

//        Final check to cover empty string.

        if (allBracketsStack.isEmpty()) {
            allBracketsMatched = true;
        }

        return allBracketsMatched;
    }
}
