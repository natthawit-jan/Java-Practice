import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
      for(int i = n-1; i >=0; i--){
        System.out.println(repeat(" ", i) + repeat("#",n-i));
      }



        /*
         * Write your code here.
        */


    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
