Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false


/**************************************************/


class Solution {
    public boolean isPalindrome(String s) {
        
        if(s == null || s.isEmpty()) return true;
        
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s= s.toLowerCase();
        //System.out.println("debug "+str);
        
        int i=0, j = s.length()-1;
        
        while(i<=j)
        {
            if(s.charAt(i) != s.charAt(j)) return false;
            
            i++;
            j--;
        }
        
        if(i>j) return true;
       
        return true;
    }
}
