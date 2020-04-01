Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4


class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 1) // edge case
        {
            return nums[0];
        }  
        
        Arrays.sort(nums); // O(N) complexity
        
        /*
        case 1: 1 2 2        XOR: 
        case 2: 1 1 2 2 3
        case 3: 1 1 2 3 3       
        */
        
        int result = nums[0];
        
        for(int i=1; i<nums.length; i++)
        {
            result = result ^ nums[i]; // same number XOR will be 0, otherwise the number itself
        }
        
        
        return result;
    }
}
