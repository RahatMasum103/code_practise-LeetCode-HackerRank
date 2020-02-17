
Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        /* O(n) time | O(1)  space */
        
        int len = nums.length; 
        
        boolean isOneFound = false; //check if '1' exists in the array
        
        for(int n : nums)
        {
            if(n == 1)
            {
                isOneFound = true; // '1' exists
                break; // no need for further check
            }
        }
        
        if(!isOneFound) // '1' is not present
        {
            return 1; // 1 is the lowest possible positive
        }
        
        /* - replace negative and greater than nums.length values
           - replace with 1, as we already have '1'
          */        
        for(int i=0; i<len; i++)
        {
            if(nums[i]<=0 || nums[i]>len) //negative or greater values
            {
                nums[i] = 1;  // replace for further use
            }
        }
        
        /* - check each element 
           - take absolute value
           - replace the index position with -1
           */
        
        for(int i=0; i<len; i++)
        {
            int idx = Math.abs(nums[i]); // if duplicate values, already negated
            if(idx < len) // array index bound check
            {
                nums[idx] = -1 * Math.abs(nums[idx]); //negaet the value at index position
            }
            else{
                /* - position 0 will not be used
                   - (value == len), will be saved in index 0;
                   */
                nums[0] = -1 * Math.abs(nums[0]); 
            }
        }
        for(int i=1; i<len; i++)
        {
            if(nums[i] > 0) // this element value has not been found
            {
                return i;
            }            
        }
        
        if(nums[0]> 0) // all values except length are present
        {
            return len;
        }
        
        return len + 1; // all values from 1 to length is present

        
        
        /* O(n) time | O(n) space */
        
        /*
        Set<Integer> set = new HashSet();
        
        for(int n : nums)
        {
            set.add(n);
        }
        
        for(int i=1; i<=nums.length; i++)
        {
            if(!set.contains(i))
                return i;
        }
        return nums.length + 1;
        */
        
    }
}
