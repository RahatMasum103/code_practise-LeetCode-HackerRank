
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
             
             /***********************************************/

class Solution {
    public int mySqrt(int x) {
        
        if(x ==0 || x== 1) return x;        
        
        int result = 0;
        
        // Binary Search approach
        
        int start = 0, end = x;
        
        while(start <= end)
        {
            //int mid = (start+end) /2;
            
            int mid = ((end - start) >> 1) + start;
            int v = x / mid;
            
            if(v == mid) //perfect square
                return v;
            
            else if(mid > v)
            {
                end = mid-1;
                result = end;
            }
            else{
                start = mid+1;
                
            }
        }
        return result;
        
        /* Naive approach 
        int i=1;
        while(result <= x)
        {
            i++;
            result = i*i;
            //System.out.println("debug "+ result+ " "+i);            
        }        
        return i-1;
        */
    }
}
