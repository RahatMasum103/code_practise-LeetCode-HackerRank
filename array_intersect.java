Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

/****************************************/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1 = 0;
        int p2 = 0;
        
        while (p1 < nums1.length && p2 < nums2.length) {
            //if one list is done we are not gonna have any intersection
            int v1 = nums1[p1];
            int v2 = nums2[p2];
            
            if (v1 == v2) {
                ans.add(v1); //intersect
                p1++;
                p2++;
            } else if (v1 > v2) { //see if this list's bigger number will intersect
                p2++;
            } else {
                p1++;
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    
        /*
        HashSet<Integer> hset = new HashSet<>();
        
        List<Integer> list = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        
        if(len1<len2)
        {
            for(int i=0; i<len2; i++ )
            {
                hset.add(nums2[i]);
            } 
                        
            
            for(int i=0; i<len1;i++)
            {
                if(hset.contains(nums1[i]))
                {
                    list.add(nums1[i]);
                }
            }
           
        }
        
        else if(len1 == len2)
        {
            for(int i=0; i<len1; i++ )
            {
                hset.add(nums1[i]);
                if(hset.contains(nums2[i]))
                {
                   list.add(nums2[i]);
                }
            }           
            
            
        }
        else{
            for(int i=0; i<len1; i++ )
            {
                hset.add(nums1[i]);
            }  
            
            
            for(int i=0; i<len2;i++)
            {
                if(hset.contains(nums2[i]))
                {
                   list.add(nums1[i]);
                }
            }
        } 
        
        
        int [] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
            result[i] = list.get(i);
        }
        
        
        //hset.addAll(Arrays.asList(nums1));
        //
        //hset.retainAll(Arrays.asList(nums2));
        
        
        
        //result = hset.toArray(result);
        
        return result;
        */
    }
}
