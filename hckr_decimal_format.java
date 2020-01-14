/*
Function Description

Complete the plusMinus function in the editor below. It should print out the ratio of positive, negative and zero items in the array, each on a separate line rounded to six decimals.

plusMinus has the following parameter(s):

arr: an array of integers
Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers describing an array of numbers .

Constraints



Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int size = arr.length;

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for(int i=0; i<size; i++)
        {
            if(arr[i] > 0)
            {
                ++posCount;
            }
            else if(arr[i] < 0)
            {
                ++negCount;
            }
            else{
                ++zeroCount;
            }

        }
        //System.out.println(posCount/size);
        //System.out.printf("'%.2f'%n", ((float)posCount/size));

        System.out.printf("%.6f %n", ((float)posCount/(float)size));
        System.out.printf("%.6f %n", ((float)negCount/(float)size));
        System.out.printf("%.6f %n", ((float)zeroCount/(float)size));



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
