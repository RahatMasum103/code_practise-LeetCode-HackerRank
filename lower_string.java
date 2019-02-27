/*
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
Input: "Hello"
Output: "hello"

Input: "LOVELY"
Output: "lovely"
*/

class Solution {
    public String toLowerCase(String str) {
        //System.out.println(str.toLowerCase());
        int size= str.length();
        StringBuilder str_out=new StringBuilder(str);
        //System.out.println(str_out.capacity());
        for(int i=0; i<size; i++)
        {
            char c = str.charAt(i);
            if(c >=65 && c <=91)
            {
                str_out.setCharAt(i, (char) (c+32));
            }
        }
        System.out.println(str_out.toString());
        
        return str_out.toString();
    }
}
