/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*/

class Solution {
    public int[] sortedSquares(int[] A) {
       //System.out.println(A.length);
        int size = A.length;
        int result[]= new int[size];
        for(int i=0; i<size; i++)
        {
            int num = A[i];
            result[i] = (int) Math.pow(num,2);
        }
        Arrays.sort(result);
        
        System.out.println(Arrays.toString(result));
        return result;
    }
}
