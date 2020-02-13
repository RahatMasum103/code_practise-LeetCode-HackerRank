Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

 

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23


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
    
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        recursive(root, L, R);
        
        return sum;
    }
    
    private void recursive(TreeNode root, int l, int r)
    {
        if(root == null) return;
        
        if(root.val >= l && root.val <=r) // checking range
        {
            sum += root.val;
        }
        
        recursive(root.left, l, r);
        recursive(root.right, l, r);
        
    }
}
