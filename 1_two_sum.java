Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

/********************************************/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int len = nums.length;
        int []index = new int[2];
        
        for(int i=0; i<len-1; i++)
        {
            int a = nums[i];
            for(int j=i+1; j<len; j++)
            {
                int b = nums[j];
                int sum = a+b;
                if(sum == target)
                {
                    index[0] = i;
                    index[1] = j;
                }
                
            }
        }
        return index;
    }
}
