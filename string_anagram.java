Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting .
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams

/***********************************************/


import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int lenA = a.length();
        int lenB = b.length();

        if(lenA != lenB) return false;

        a=a.toLowerCase();
        b=b.toLowerCase();


        int countA[] = new int [26];
        int countB[] = new int [26];

        for(int i=0; i<lenA; i++){
            countA[a.charAt(i) - 'a']++;
            countB[b.charAt(i) - 'a']++;
            //System.out.print("debug.." + countA[i]+ " ");
        }
        for(int i=0; i<26; i++)
        {
            System.out.println(countA[i] + " ");
        }   

        for(int i=0; i<26;i++)
        {
            if(countA[i] !=countB[i]) return false;
        }      
        
        return true;
    }

  public static void main(String[] args) {
