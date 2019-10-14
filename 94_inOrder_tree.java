Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
Follow up: Recursive solution is trivial, could you do it iteratively?


/**************************************************/


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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> path = new ArrayList();
        
        inOrder(root,path);
        return path;
        
    }
    
    public void inOrder(TreeNode root, List<Integer> path)
    {
        if( root == null)
            return;
        
        inOrder(root.left, path);
        path.add(root.val);
        inOrder(root.right,path);
    }
}
