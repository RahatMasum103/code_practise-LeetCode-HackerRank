Given an array A, partition it into two (contiguous) subarrays left and right so that:

Every element in left is less than or equal to every element in right.
left and right are non-empty.
left has the smallest possible size.
Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.

 

Example 1:

Input: [5,0,3,8,6]
Output: 3
Explanation: left = [5,0,3], right = [8,6]
Example 2:

Input: [1,1,1,0,6,12]
Output: 4
Explanation: left = [1,1,1,0], right = [6,12]



/**************************************/

class Solution {
    public int partitionDisjoint(int[] A) {
        int len = A.length;
        //System.out.println("debug... "+len);
        int left [] =new int[len];
        int right [] = new int[len];
        
        int max = A[0];
        for(int i=0; i<len; i++)
        {
            max = Math.max(max,A[i]);
            //System.out.print("debug... "+max +" ");
            left[i]=max;
        }
        
        //System.out.println();
        int min = A[len-1];
        for(int i=len-1; i>=0; i--)
        {
            min = Math.min(min,A[i]);
            //System.out.print("debug... "+min+" ");
            right[i]=min;
        }
        
        //System.out.println();
        for(int i=1; i<len; i++)
        {
            //System.out.println("debug... "+ left[i-1] + " " + right[i]);
            if(left[i-1] <= right[i])
                return i;
                //System.out.println("debug... "+ left[i-1] + " " + right[i]);
        }                
        
        return len;
    }
}
