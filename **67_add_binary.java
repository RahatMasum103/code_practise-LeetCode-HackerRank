/*
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

class Solution {
    public String addBinary(String a, String b) {
        
        int lenA = a.length();
        int lenB = b.length();
        
        //if(lenB > lenA) return addBinary(b,a);
        
        int i = lenA - 1;
        int j = lenB - 1;
        
        
        int carry = 0; 
        StringBuilder sum = new StringBuilder();
        
        while(i >= 0 || j >= 0)
        {
            int temp = carry;
                        
            if(i >= 0)
            {
                temp += a.charAt(i) - '0';
                i--;
            }
            
            if(j >= 0)
            {
                temp += b.charAt(j) - '0';
                j--;
            }
            
            sum.append(temp % 2);
            carry = temp/2;   
            
            //System.out.println("sum: "+ sum);
            //System.out.println("carry: "+ carry);
            
        }
        
        if(carry>0){
            sum.append(carry);
        }
        
        return sum.reverse().toString();
    }
}
