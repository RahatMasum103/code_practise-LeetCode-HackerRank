Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680


import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BigInteger a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    
    }
}

