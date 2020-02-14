Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.


class Solution {
    public String addStrings(String num1, String num2) {
        
        String result = ""; // holds the result
        Stack<Integer> stk = new Stack(); // hold the sum    
        int carry = 0;
        
        int len1 = num1.length();
        int len2 = num2.length();
        int i = len1-1;
        int j = len2-1;
        
        while(i >=0 || j>=0) // reading digits
        {
            int sum = 0; 
            int a = 0;
            int b = 0;
            if(i<0) // num1 is smalelr than num2
            {
                b = num2.charAt(j) - '0';
            }
            else if(j<0) // num2 is smaller than num1
            {
                a = num1.charAt(i) - '0';
            }
            else{ 
                a = num1.charAt(i) - '0'; // returns integer value of a character
                b = num2.charAt(j) - '0';
            }
            
            sum = carry + a + b; // calculating digit by digit sum
            
            stk.push(sum % 10); // adding in LSB to MSB into stack
            carry = sum/10;  // update the carry dor next digit
            
            i--;
            j--;
        }
        
        if(carry > 0)
        {
            result = result + carry; // extra carry
        }        
        while(!stk.isEmpty())
        {
            result = result + stk.pop(); // LIFO to get the LSB to MSB sum
        }        
        return result;       

    }
}
