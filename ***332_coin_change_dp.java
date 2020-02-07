You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3 
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Note:
You may assume that you have an infinite number of each kind of coin.


class Solution {
    public int coinChange(int[] coins, int amount) {
        
        if(amount <=0) return 0; // edge case
        
        int dp[] = new int [amount+1]; // DP array
        
        int len = coins.length; // number of coins
        
        Arrays.fill(dp, amount+1); // DP array with a bigger value
        
        dp[0] = 0; // base case
        
        for(int i=1; i<= amount; i++) // how to make amount 1 ,...to 11 
        { 
            int min = amount+1; // minimum initialization
            for(int c=0; c<len; c++) // check for each coins
            {
                if(coins[c] <= i) // coin value smaller than Amount remaining
                {
                    min = Math.min(dp[i-coins[c]], min); // memoization
                }
            }
            dp[i] = min + 1; // plus 1 for taking one coin always
        }      
        
        // can not makeable, means dp[amount] is not set/calculated
        return dp[amount] <= amount ? dp[amount] : -1;     
        
       
    }
}
