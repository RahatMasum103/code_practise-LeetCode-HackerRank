Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

/**********************/


class Solution {
    public int strStr(String haystack, String needle) {
       
        /* 
        //solution 1 
        
        int idx = haystack.indexOf(needle);
        
        return idx;
        */
        
        // solution 2
        int lenNed = needle.length();
        int lenHay = haystack.length();
        
        if(lenNed == 0) return 0;
        for (int i = 0; i < lenHay - lenNed + 1; i ++) 
        {
            String pos = haystack.substring(i, i + lenNed);
            if (pos.equals(needle)) return i;
        }
        return -1;
        
    }
}
