A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.

 

Example 1:


Input: [1,1,1,1,1,null,1]
Output: true
Example 2:


Input: [2,2,2,5,2]
Output: false


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
    int val = 0;
    public boolean isUnivalTree(TreeNode root) {
        
        val = root.val;
        
        return recursive(root);       
        
    }
    
    private boolean recursive(TreeNode node)
    {
        if (node == null) return true;
        
        if(val != node.val) return false;
        
        return recursive(node.left) && recursive(node.right);
    }
}
