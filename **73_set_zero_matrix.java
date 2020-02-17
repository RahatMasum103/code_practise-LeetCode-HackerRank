Example 1:

Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
Example 2:

Input: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]

/* O(1) Space */

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean isFirstRow = false;
        boolean isFirstCol = false;
        
        for(int i=0; i<row; i++)
        {
            if(matrix[i][0] == 0)
            {
                isFirstCol = true;
            }
        }
        
        for(int j=0; j<col; j++)
        {
            if(matrix[0][j] == 0)
            {
                isFirstRow = true;
            }
        }
        
        for(int i=1; i<row; i++)
        {
            for(int j=1; j<col; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
         for(int i=1; i<row; i++)
        {
            for(int j=1; j<col; j++)
            {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                {
                    matrix[i][j] =0;
                }
            }
         }
        
        if(isFirstRow == true)
        {
            for(int j=0; j<col; j++)
            {
                matrix[0][j] =0;
            }
        }
        
        if(isFirstCol == true)
        {
            for(int i=0; i<row; i++)
            {
                matrix[i][0] =0;
            }
        }
        
        return;
                
    }
}


/*    O(M x N) solution */

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        Set<Integer> rs = new HashSet();
        Set<Integer> cs = new HashSet();
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rs.add(i);
                    cs.add(j);
                }
            }
        }
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(rs.contains(i) || cs.contains(j))
                {
                    matrix[i][j] = 0;
                }
                
            }
        }
        
        return;
                
    }
}
