import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxBigNumber {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {

      BigInteger commonSumFromTheRight =
      convertToBigInteger(arr[2]).add(
      convertToBigInteger(arr[3])).add(
      convertToBigInteger(arr[4]));

      BigInteger commonSumFromTheLeft =
      convertToBigInteger(arr[0]).add(
      convertToBigInteger(arr[1])).add(
      convertToBigInteger(arr[2]));



      // except the first index
      BigInteger combi1 = convertToBigInteger(arr[1]).add(commonSumFromTheRight);
      //except the second index

      BigInteger combi2 = convertToBigInteger(arr[0]).add(commonSumFromTheRight);
      // except the third index
      BigInteger toSubTract  = convertToBigInteger(arr[2]);
      toSubTract  = toSubTract.multiply(new BigInteger("2"));
      BigInteger combi3 = commonSumFromTheLeft.add(commonSumFromTheRight).subtract(toSubTract);
      //except the forth index
      BigInteger combi4 = commonSumFromTheLeft.add(convertToBigInteger(arr[4]));
      //except the fifth index
      BigInteger combi5 = commonSumFromTheLeft.add(convertToBigInteger(arr[3]));

      List<BigInteger> minMaxList = Arrays.asList(combi1, combi2, combi3, combi4, combi5);
      // put everything into the List

      System.out.print(Collections.min(minMaxList)+ " "+Collections.max(minMaxList));



    }

    static BigInteger convertToBigInteger(long a){
      return new BigInteger(Long.toString(a));

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
