
Input Format

A single line containing an integer,  (the number to be checked).

Constraints

 contains at most  digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime

/***********************************************/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.close();

        if(n<1)
        {
            System.out.println("not prime");
        }
        else{
            int notPrime=0;
            for(int i=2 ; i<n/2; i++)
            {
                if(n%i ==0)
                {
                    notPrime =1;                    
                }                
            }
            if(notPrime==1)
            {
                System.out.println("not prime");
                
            }
            else{
                System.out.println("prime");
            }
        }
    }
}
