Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2

/********************************/


class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        int len = nums.length;
        
        for(int i=0; i<len; i++)
        {
            int num = nums[i];
            if(hmap.containsKey(num))
            {
                hmap.put(num, hmap.get(num)+1);
            }
            else{
                hmap.put(num,1);
            }
        }
        
        int ocur = (int) Math.floor(len/2);
        //System.out.println(ocur);
        int major = 0;
        int temp =0;
        for(Integer k: hmap.keySet())
        {
            int val = hmap.get(k);
            if(val > ocur && temp <val){
                major = k;
                temp = Math.max(temp,val);
            }
        }
        
        return major;
    }
}
