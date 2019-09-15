Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true

/**************************************************************/


class Solution {
    
    private HashMap<Character,Character> hmap = new HashMap<Character,Character> ();
    private Stack<Character> stk = new Stack<Character> ();
    
    public boolean isValid(String s) {
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');
        
        //System.out.println("debug... "+ hmap.size());
        
        int len = s.length();
        
        for(int i=0; i<len; i++)
        {
            char c = s.charAt(i);
            if(!hmap.containsKey(c))
            {
                stk.push(c);
                //System.out.println("debug... "+ stk.size());
            }
            else{
                if(!stk.isEmpty())
                {
                    char top = stk.pop();
                    if(top != hmap.get(c))
                    {
                        return false;
                    }                    
                }                
            }            
        }       
        return stk.isEmpty();
    }
}
