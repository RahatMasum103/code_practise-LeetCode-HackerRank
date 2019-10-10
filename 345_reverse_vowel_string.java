Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"

/******************************/


class Solution {
    public String reverseVowels(String s) {
        Set<Character> hset = new HashSet<>();
        
        hset.add('a');
        hset.add('e');
        hset.add('i');
        hset.add('o');
        hset.add('u');
        hset.add('A');
        hset.add('E');
        hset.add('I');
        hset.add('O');
        hset.add('U');
        
        int i = 0; 
        int j = s.length()-1;
        
        
        
        char[] result = s.toCharArray();
        
        while(i<j)
        {
            while(i<j && !hset.contains(result[i])) 
            {
                i++;
            }
            while(i<j && !hset.contains(result[j])) 
            {
                j--;
            }
            
            char c = result[i];
            result[i++] = result[j];
            result[j--] = c;
        }
        
        return new String(result);
        
    }
}
