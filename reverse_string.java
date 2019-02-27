/*
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/

class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        //int last_index =size+1/2;
        for(int i=0; i<size/2; i++)
        {
            char temp = s[i];
            s[i] = s[size-1-i];
            s[size-1-i] = temp;            
        }            
        
    }
}
