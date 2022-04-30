import java.util.Stack;

public class MainSolution {

    public boolean parenthesesChecker(String input) {

        String[] letters = input.split("");

        Stack<String> foundBrackets = new Stack<>();

        for (String letter : letters) {
            if (letter.equals("(")) {
                foundBrackets.add(letter);
            } else if (letter.equals(")")) {
                if (foundBrackets.isEmpty() || !foundBrackets.pop().equals("(")) {
                    return false;
                }
            }
        }

        return foundBrackets.isEmpty();
    }

}
