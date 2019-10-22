Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

/******************************************************/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        if(numRows == 0){
            return triangle;
        }
        
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        
        for(int i = 1; i<numRows; i++)
        {            
            List<Integer> row = new ArrayList<Integer>();
            
            row.add(1); // for the first column
            
            for(int j =1; j<i; j++)
            {                
                int sum = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                row.add(sum);
            }
            
            row.add(1);    // for the last column
            
            triangle.add(row);
        }
        return triangle;
    }
}
