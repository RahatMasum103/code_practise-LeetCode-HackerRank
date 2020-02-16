Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".




class Solution {
    public String decodeString(String s) {
        
        Stack<String> sStr = new Stack<>();
        Stack<Integer> sNum = new Stack<>();
        
        String result = "";
        int digit = 0;
        int k = 0;
        while(k < s.length()) 
        {
            char c = s.charAt(k);
            if(Character.isDigit(c))
            {                
                digit = 10 * digit + (c -'0');
            }
            else if(c == '[')
            {
                sNum.push(digit);
                digit = 0;
                sStr.push(result);
                result = "";
            }            
            else if(c ==']')
            {
                StringBuilder sb = new StringBuilder(sStr.pop());
                int count = sNum.pop();
                for(int i=0; i< count; i++)
                {
                    sb.append(result);
                }
                result = sb.toString();                
            }
            else{
                result = result + c;
            }
            k++;
        }
        
        return result;
        
    }
}
