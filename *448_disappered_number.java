/*** better approach found here https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/discuss/488308/Java-oror-O(n)-time-oror-O(1)-space-oror-Thought-Process
**/

/** my approach O(n), O(n) */
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> hset = new HashSet(); // using Set data structure
        int len = nums.length; // array size
        
        for(int i=0; i<len; i++)
        {
            hset.add(nums[i]); //removing duplicate by inserting into Set
        }
        
        List<Integer> result = new ArrayList<>();
        
        for(int n=1; n<len; n++) // Array is of size n
        {
            if(!hset.contains(n)) // number should not be in Set if missing
            {
                result.add(n); // missing n digits into List
            }
        }
        return result;
    }
}
