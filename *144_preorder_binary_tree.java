Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]

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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList();
        
        /* root : left : right */
        recursiveTraverse(root, result); // call upto leaf node
        return result;
    }
    
    private void recursiveTraverse(TreeNode node, List<Integer> list)
    {
        if(node == null) //base case: leaf node found;
            return;
        
        list.add(node.val); // adding root;
        recursiveTraverse(node.left, list); // left subtree traversal
        recursiveTraverse(node.right, list); //right subtree traversal       
        
    }
}
