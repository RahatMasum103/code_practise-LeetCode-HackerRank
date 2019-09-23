Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

/******************************************************/


class Solution {
    public int[] plusOne(int[] digits) {
        
        int size = digits.length;
        System.out.println("debug.. "+size);
        
        if(digits[size-1]<9)
        {
            digits[size-1] = digits[size-1] +1;
            return digits;
        }
        else{
            int carry =1;
            
            for(int i=size-1; i>=0; i--)
            {
                int sum = carry + digits[i];
                carry = sum/10;
                digits[i] = sum%10;
            }
            if(carry==1)
            {
                int result[] = new int [size+1];
                result[0] = carry;
                
                int j=1;
                for(int i=0;i<size; i++)
                {
                    result[j] = digits[i];
                    j++;
                }
                return result;
            }           
            
        }            
        
        return digits;
    }
}
