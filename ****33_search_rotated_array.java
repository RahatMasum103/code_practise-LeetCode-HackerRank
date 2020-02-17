Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1



class Solution {
    int index = -1;
    public int search(int[] nums, int target) {
       
        recursive(nums, 0, nums.length-1, target);
        
        return index;    
    }
    
    private void recursive(int[] nums, int left, int right, int target)
    {
        if(left>right)
            return;
        
        int mid = left + (right - left)/2;
        
        if(nums[mid] == target)
        {
            index = mid;
            return;
        }
        else if(nums[mid] > target)
        {
            if(nums[right] < nums[mid] && target < nums[left])
            {
                 recursive(nums, mid+1, right, target);
            }
            else{
                 recursive(nums, left, mid-1, target);
            }
            
        }
        else{
            if(nums[left]>nums[mid] && target > nums[right])
            {
                 recursive(nums, left, mid-1, target);
            }
            else{
                 recursive(nums, mid+1, right, target);
            }
        }
       
    }
}
