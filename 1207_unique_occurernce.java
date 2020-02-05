Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> hmap = new HashMap();
        
        for(int i=0; i<arr.length; i++)
        {
            int val = arr[i];
            if(hmap.containsKey(val))
            {
                hmap.put(val, (hmap.get(val)+1)); //if element already exists
            }
            else{
                hmap.put(val,1); //first occurrence of element
            }
        }
        
        Set<Integer> hset =new HashSet();
        
        for(Integer n: hmap.keySet())
        {
            int count = hmap.get(n); // numer of occurrence of element
            if(hset.contains(count)) // not unique
                return false;
            else{
                hset.add(count); //add the count into Set
            }
        }
        return true;
    }
}
