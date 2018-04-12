import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PlusMinusFraction {
  static int indexPointer = 0;

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
      Arrays.sort(arr);

      int minusNumber = checkMinus(arr);
      int zero = checkZero(arr);
      int plusNumber = checkPlus(arr);

      System.out.println(plusNumber/(double)arr.length);
      System.out.println(minusNumber/(double)arr.length);
      System.out.println(zero/(double)arr.length);





    }

    static int checkMinus(int[] arr){
      int sumMinus =0 ;
      for (int i = indexPointer; i < arr.length; i++){
        if (arr[i] < 0) {
          sumMinus++;
          indexPointer++;
        }
        else{
          break;
        }

      }
      return sumMinus;
    }
    static int checkZero(int[] arr){
      int sumZero =0 ;
      for (int i = indexPointer ; i <arr.length ;i++ ) {
        if ( arr[i] == 0){
          sumZero++;
          indexPointer++;
        }
        else{
          break;
        }
      }

      return sumZero;

    }
    static int checkPlus(int[] arr){
      int sumPlus =0 ;
      for (int i = indexPointer ; i <arr.length ;i++ ) {
        if (arr[i] > 0)  {
          sumPlus++;
          indexPointer++;

        }
        else{
          break;
        }
      }
      return sumPlus;
    }





    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
