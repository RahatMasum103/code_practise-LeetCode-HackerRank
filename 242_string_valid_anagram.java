
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

/************************************************************/


class Solution {
    public boolean isAnagram(String s, String t) {
        
        int lenS = s.length();
        int lenT = t.length();
        
        if(lenS !=lenT) return false;
        
        char [] cs = s.toCharArray();
        char [] ct = t.toCharArray();
        
        Arrays.sort(cs);
        Arrays.sort(ct);
        
        String strC = new String (cs); 
        String strT = new String (ct);
        
        if(!strC.equals(strT)) return false;
        
        return true;
    }
}
