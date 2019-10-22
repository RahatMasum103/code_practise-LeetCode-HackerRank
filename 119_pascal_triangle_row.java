Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 3
Output: [1,3,3,1]

/*****************************************************/



class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        
        if(rowIndex == 0){
            return new ArrayList<Integer>(1);
        }
        
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        
        for(int i = 1; i<=rowIndex; i++)
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
        return triangle.get(rowIndex);
    }
}
