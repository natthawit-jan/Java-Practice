import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMax {

    /*
     * Complete the miniMaxSum function below.
     */
    static long miniMaxSum(int[] arr) {
      long commonSumFromTheRight = arr[2]+arr[3]+arr[4];
      long commonSumFromTheLeft = arr[0] + arr[1] + arr[2];

      List<Long> minMaxList = new ArrayList<>();
      // except the first index
      long combi1 =  

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
