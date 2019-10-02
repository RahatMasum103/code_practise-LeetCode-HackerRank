Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

/*************************************/


class Solution {
    public int missingNumber(int[] nums) {
        
        
        //Arrays.sort(nums);
        int n = nums.length+1;
        //int n = nums[len-1];
        
        int nSum = n * (n-1)/2;
        
        System.out.println(nSum);
        int aSum = Arrays.stream(nums).sum();
       // System.out.println(aSum);
        return nSum-aSum;
    }
}
