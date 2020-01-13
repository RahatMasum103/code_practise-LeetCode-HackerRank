/************

Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character
Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')



************/

class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int dp[][] = new int [m+1][n+1];
        
        dp[0][0] = 0; //base case for {} empty string for both words
        
        for(int i = 1; i <= m; i++)
        {
            dp[i][0] = i; // if A is empty, all it needs to DELETE all from B
        }
        
        for(int j = 1; j <= n; j++)
        {
            dp[0][j] = j; // if B is empty, it needs to INSERT all from A
        }
        
        // REPLACE operation
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
    // any letter matches, we remove it from the consideration
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]; 
                }
                
    // if a MISMATCH foundd, need to take the minimum from all replace, insert, delete
                
                else{
                    //.............REPLACE ...............DELETE.............INSERT
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1],dp[i-1][j]));
                }
            }
        }           

        
        return dp[m][n];
    }
}
