Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

 

Example 1:

Input: "leetcodeisacommunityforcoders"
Output: "ltcdscmmntyfrcdrs"
Example 2:

Input: "aeiou"
Output: ""

/*******************************************/

class Solution {
    public String removeVowels(String S) {
        
        HashSet<Character> hset= new HashSet<>();
        
        hset.add('a');
        hset.add('e');
        hset.add('i');
        hset.add('o');
        hset.add('u');
        
        S = S.toLowerCase();
        String result = "";
        
        for(int i=0; i< S.length(); i++)
        {
            if(!hset.contains(S.charAt(i)))
            {
                result += S.charAt(i);
            }
        }
        
        return result;
    }
}
