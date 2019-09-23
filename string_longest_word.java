Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5

/******************************************************/


class Solution {
    public int lengthOfLastWord(String s) {
        
        
        s=s.trim();
        int len = s.length();
        //int max=0;
        int count =0;
        for(int i=0; i<len;i++)
        {            
            if(s.charAt(i) !=' ') count++;
            else{
                count=0;
            }
            //if(max<count) max =count;
        }
        return count;
    }
}
