Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.


/***********************************************************/

class Solution {
    public int minPathSum(int[][] grid) {
        
        int row = grid.length;
        
        if(row < 1) return 0;
        
        int col = grid[0].length;      
        
        
        int sum[][] = new int [row][col];
        
        //System.out.println(row + " " + col);
        
        sum[0][0] = grid[0][0]; // row= 0, col = 0
        for(int i=1; i<row; i++)
        {
            sum[i][0] = sum[i-1][0] + grid[i][0];
        }
        
        for(int j=1; j<col; j++)
        {
            sum[0][j] = sum[0][j-1] + grid[0][j];
        }
        
         for(int i=1; i<row; i++)
        {
            for(int j=1; j<col; j++)
            {
                int val = Math.min(sum[i-1][j], sum[i][j-1]);
                sum[i][j] = grid[i][j] + val;
            }         
        }       
        
        /* debug
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();            
        }    
        
        */
        int res = sum[row-1][col-1];
        
        return res; 
    }
}
