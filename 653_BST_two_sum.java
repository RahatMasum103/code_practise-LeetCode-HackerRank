Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:

Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
 

Example 2:

Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False


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
    Set<Integer> set = new HashSet();
    
    public boolean findTarget(TreeNode root, int k) {       
                
        return recursive(root, k); 
    }
    
    private boolean recursive(TreeNode root, int val)
    {
        if(root == null) // leaf node
            return false;
        
        if(set.contains(root.val))  // set contains the compliment
            return true;
        
        set.add(val - root.val); // adding compliment value of root
        
        return recursive(root.left, val) || recursive(root.right, val); // check subtree
    }
}
