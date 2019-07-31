/*
Task 
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form: 
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankcode;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author APU
 */
public class NumberMultiply {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int N = scanner.nextInt();   
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); 
        /*It is a Scanner class method which skips input that 
        matches the specified pattern, ignoring delimiters.*/ 
        
        /*
        1st Alternative \r\n
        \r matches a carriage return (ASCII 13)
        \n matches a line-feed (newline) character (ASCII 10)
        2nd Alternative [\n\r\u2028\u2029\u0085]

        Match a single character present in the list below [\n\r\u2028\u2029\u0085]
        \n matches a line-feed (newline) character (ASCII 10)
        \r matches a carriage return (ASCII 13)
        \u2028 matches the character with index 202816 (823210 or 200508) literally (case sensitive) LINE SEPARATOR
        \u2029 matches the character with index 202916 (823310 or 200518) literally (case sensitive) PARAGRAPH SEPARATOR
        \u0085 matches the character with index 8516 (13310 or 2058) literally (case sensitive) NEXT LINE
           
        */        
        scanner.close();
        
        for(int i=1; i<=10; i++)
        {
            int result = N * i;
            System.out.println(N +" x "+i +" = "+ result);
        }
    }
    
}
