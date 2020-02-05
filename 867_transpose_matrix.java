Given a matrix A, return the transpose of A.

The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.



Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


class Solution {
    public int[][] transpose(int[][] A) {
        
        int row = A.length; //numer of rows
        int col = A[0].length; // number of columns
        
        int [][] result = new int[col][row]; //to store transpose result
        //System.out.println("row: "+row+" col: " + col);
        
        /** O(row*col) time */
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                //int curr_element = A[i][j];
                result[j][i] = A[i][j]; // row becomes column
                //A[j][i] = curr_element;                
            }
        }
                
        return result;
        
        
    }
}
