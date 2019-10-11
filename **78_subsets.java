Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]


/*****************************************************/


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        findSubset(nums, 0, new ArrayList<>(), result);
        
        return result;
    }
    
    public void findSubset(int[] nums, int index, List<Integer> current, List<List<Integer>> result){
        
        result.add(current);
        
        for(int i=index; i< nums.length; i++)
        {
            current.add(nums[i]);
            findSubset(nums, i+1, new ArrayList<>(current), result);
            current.remove(current.size() - 1);
        }
    }
}
