Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000

/*******************************************/
 /* O(n) with one pass */
 
 class Solution {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int [] result = new int[len];
        
        int i=0;
        int j= len-1;
        int m=0;
        
        while(i<len){
            if(A[i] %2 ==0) 
            {
                result[m] = A[i]; 
                m++;
            }
            else 
            {
                result[j] = A[i];
                j--;
            }
            i++;
            
        }       
        return result;
    }
} 
 
/* BRUTE FORCE */

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int [] result = new int[len];
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int i=0; i<len;i++)
        {
            if(A[i]%2 ==0) even.add(A[i]);
            else odd.add(A[i]);
        }
        
        for(int i=0; i<even.size(); i++)
        {
            result[i] = even.get(i);
        }
        int j=even.size();
        for(int i=0; i<odd.size();i++)
        {
            result[j] = odd.get(i);
            j++;
        }
        
        return result;
    }
}


