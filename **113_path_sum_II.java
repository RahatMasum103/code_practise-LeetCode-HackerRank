Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> paths = new ArrayList<>();
        
        pathFind(root, sum, new ArrayList<Integer>(), paths);        
        
        return paths;
    }
    
    public void pathFind(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> route){
        if(root == null) return;
        
        temp.add(root.val);
        if(root.left == null && root.right == null && sum - root.val ==0)
        {
            route.add(temp);
            return;
        }
        
        pathFind(root.left, sum-root.val, new ArrayList<Integer>(temp), route);
        pathFind(root.right, sum-root.val, new ArrayList<Integer>(temp), route);
        
        
    }
}
