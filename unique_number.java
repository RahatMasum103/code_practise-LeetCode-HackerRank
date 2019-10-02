Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4

/*********************************/


class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        
        if(len<1) return 0;
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<len; i++)
        {
             int k = nums[i];
             if(hmap.containsKey(k))
             {
                 hmap.put(k, (hmap.get(k)+1)) ; 
             }
             else{
                 hmap.put(k,1);
             }          
        }
        
        int number=0;
        for(Integer k: hmap.keySet())
        {
            if(hmap.get(k)==1) number = k;
            else continue;
        }
        
        
        
        /*
        Arrays.sort(nums);
        int single=0;;
        
        for(int i=0; i<len-1; i++)
        {
            if(nums[i] == nums[i+1]) continue;
            
            else single = nums[i];
        }
        */
        
        return number;
    }
}
