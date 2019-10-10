Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.

/***************************************/



class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0 ; j<board[i].length; j++)
            {
                if(board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, int i, int j, int countMatch, String word)
    {
        if(countMatch == word.length())
        {
            return true;
        }
        
        if(i<0 || i>=board.length || j<0 || j>= board[i].length || board[i][j] !=word.charAt(countMatch)){
            return false;
        }
        
        char temp = board[i][j];
        
       // System.out.print(i+" "+ j+" "+temp+ " ");
       // System.out.println();
        board[i][j] = ' ';
        boolean result
            = dfs(board, i, j+1, countMatch+1, word)
            || dfs(board, i, j-1, countMatch+1, word)
            || dfs(board, i-1, j, countMatch+1, word)
            || dfs(board, i+1, j, countMatch+1, word) ;
        
        //System.out.println(board[i][j]);
        board[i][j] = temp;
        
        return result;
            
    }
}
