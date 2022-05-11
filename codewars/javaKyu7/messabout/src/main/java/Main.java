public class Main {
    public static void main(String[] args) {

        String number = "3 1 6 5 7 3";

        String[] splitNumbStrings = number.split(" ");
        int[] splitNumbInts = new int [splitNumbStrings.length];

        for (int i = 0; i < splitNumbStrings.length; i++) {
            splitNumbInts[i] = Integer.parseInt(splitNumbStrings[i]);
        }

        int lowest = splitNumbInts[0];
        int highest = splitNumbInts[0];


        for (int i = 1; i < splitNumbInts.length; i++) {
            if (splitNumbInts[i] > highest) {
                highest = splitNumbInts[i];
            } else if (splitNumbInts[i] < lowest) {
                lowest = splitNumbInts[i];
            }
        }

        String output = Integer.toString(highest) + " " + Integer.toString(lowest);

        System.out.println(output);

    }
}



