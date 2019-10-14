Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

/*************************************/



class Solution {
    public int longestPalindrome(String s) {
        
        if(s == null || s.length() <1) return 0;
        int len = s.length();
                        
        Set <Character> set = new HashSet<>();
        
        for(int i=0; i<len; i++)
        {
            char c= s.charAt(i);
            if(set.contains(c))
            {
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        
        if(set.size() <= 1) 
            return len;
        else{
            return (len - set.size() + 1);
        }
        

    }
}
