Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

/**************************************/


class Solution {
    public int maxSubArray(int[] nums) {
        
        int N = nums.length;
        if(N == 0) return 0;
        int i = 0, j = 0;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        while(j<N){
            curr += nums[j];
            max=Math.max(curr, max);
            if(curr < 0){
                curr = 0;
                j++;
                //i = j;
            } else {
                j++;
            }
        }
        
        return max;
        //return max;
    }
}
