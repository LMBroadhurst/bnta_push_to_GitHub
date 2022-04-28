import java.util.ArrayList;
import java.util.Arrays;

public class ParenthesesChecker {

    boolean checkParentheses(String testString) {

        boolean bracketsMatched = false;

        String[] splitTestString = testString.split("");

        System.out.println(Arrays.toString(splitTestString));

        ArrayList<String> addBracketsHere = new ArrayList<>();

        for (String character: splitTestString) {
            if (character.equals("(") || character.equals(")")) {
                addBracketsHere.add(character);
            }
        }

        if (addBracketsHere.size() % 2 == 0) {
            bracketsMatched = true;
        }

        System.out.println(addBracketsHere);
        System.out.println(addBracketsHere.size());

        return bracketsMatched;
    }
}
