Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes

/****************************************/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();

        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        int i=0, j = len-1;
        while (i<=j)
        {
            if(A.charAt(i) != A.charAt(j)) 
            {
                System.out.print("No");
                break;
            }
            i++;
            j--;
        }
        if(i>j) System.out.print("Yes");
      
    }
}



