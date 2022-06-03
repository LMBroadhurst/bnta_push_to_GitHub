import java.util.*;
import java.util.stream.Collectors;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(102);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);


        miniMaxSum(arr);

    }


        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here

            Collections.sort(arr);

            long sum = 0;

            for(int i=0;i<arr.size();i++){
                sum += arr.get(i);
            }

            long low_sum = sum - arr.get(arr.size()-1);
            long hig_sum = sum - arr.get(0);

            System.out.println(low_sum + " " + hig_sum);

        }

}


/*

int arrSum = 0;

            for (int number: arr) {
                arrSum += number;
            }


            int smallestValue = 1000;

            for (int i = 0; i < (arr.size()); i++) {
                if (smallestValue > arr.get(i)) {
                    smallestValue = arr.get(i);
                }
            }

            int largestValue = -1000;

            for (int i = 0; i < (arr.size()); i++) {
                if (largestValue < arr.get(i)) {
                    largestValue = arr.get(i);
                }
            }

            int finSmallest = arrSum - largestValue;
            int finLargest = arrSum - smallestValue;


            System.out.println(finSmallest + " " + finLargest);

 */