package generics_lab.exercise2;

public class Generics_Lab_Ex2 {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Hi, I'm ", 10);
        Pair<Integer, String> pair2 = new Pair<>(100, "Yes Sir");
        Pair<String, String> pair3 = new Pair<>("Hi", "Sir");

    }

}
