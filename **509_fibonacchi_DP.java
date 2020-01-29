The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

 

Example 1:

Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


class Solution {
    
    public int fib(int N) {
        
        if(N<2) return N;
        
        int dp [] = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;
        
        /**** dynamic programmic Recursive solution  ***/
        /*
        if(N<2) return N;
        
        int dp [] = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;
        */
        
        /*
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = -1;
        }
                
        return fib_recur(N, dp);
        */
        
        /*** dynamic programming solution - Iterative ***/
        
        for(int i=2; i<dp.length; i++)
        {
            dp[i] = dp[i-2] + dp[i-1];
        }
        
        return dp[N];
    }
    
    /*
    private int fib_recur(int num, int [] dp)
    {
        if(dp[num] >= 0) return dp[num];
        
        dp[num] = fib_recur(num-1, dp) + fib_recur(num-2, dp);
        
        return dp[num];
    }
    */
}
