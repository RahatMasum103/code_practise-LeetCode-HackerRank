Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format

Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel

/*******************************************************/



import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";

        int len = s.length();
        for(int i=0; i<(len-k)+1;i++)
        {
            String tempSub = s.substring(i,i+k);
            if(tempSub.compareTo(smallest)<0) smallest = tempSub;
            if(tempSub.compareTo(largest)>0) largest = tempSub;
            
        } 
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //sub[0] = s.substring(0);
        //System.out.println(sub[0]);
        return smallest + "\n" + largest;
    }

