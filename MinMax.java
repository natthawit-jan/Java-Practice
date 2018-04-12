import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class MinMax {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
      long commonSumFromTheRight = arr[2]+arr[3]+arr[4];
      long commonSumFromTheLeft = arr[0] + arr[1] + arr[2];


      // except the first index
      long combi1 = arr[1]+commonSumFromTheRight;
      //except the second index
      long combi2 = arr[0]+commonSumFromTheRight;
      // except the third index
      long combi3 = (commonSumFromTheLeft+commonSumFromTheRight)-(2*arr[2]);
      //except the forth index
      long combi4 = commonSumFromTheLeft+arr[4];
      //except the fifth index
      long combi5 = commonSumFromTheLeft+arr[3];

      List<Long> minMaxList = Arrays.asList(combi1, combi2, combi3, combi4, combi5);
      // put everything into the List

      System.out.print(Collections.min(minMaxList)+ " "+Collections.max(minMaxList));



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
