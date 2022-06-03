import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        float noOfPositives = 0;
        float noOfZeros = 0;
        float noOfNegatives = 0;

        for (int number: arr) {
            if (number > 0) {
                noOfPositives += 1;
            }
            if (number == 0) {
                noOfZeros += 1;
            }
            if (number < 0) {
                noOfNegatives += 1;
            }
        }

        float positiveOutput = noOfPositives / arr.size();
        float zeroOutput = noOfZeros / arr.size();
        float negativeOutput = noOfNegatives / arr.size();


        System.out.format("%.6f", positiveOutput);
        System.out.println("");
        System.out.format("%.6f", negativeOutput);
        System.out.println("");
        System.out.format("%.6f", zeroOutput);



    }

}