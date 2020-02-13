Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        Set<Integer> set = new HashSet();
        Set<Integer> intersection = new HashSet();
        
        if(len1>len2)
        {
            for(int i : nums1){
                set.add(i);
            }
            
            for(int i : nums2)
            {
                if(set.contains(i))
                {
                    intersection.add(i);
                }
            }
        }
        else{
            for(int i : nums2){
                set.add(i);
            }
            
            for(int i : nums1)
            {
                if(set.contains(i))
                {
                    intersection.add(i);
                }
            }
            
        }
        
        int [] res = new int [intersection.size()];
        int i = 0;
        for(int n : intersection)
        {
            res[i++] = n;
        }
        return res;
    }
}
