Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3

/************************************************************/



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
    
    public void findPath(TreeNode root, String current, List<String> paths)
    {
        if(root == null) return;
        
        if(current.length() == 0)
        {
            current = root.val + "";
        }
        else{
            current = current +"->"+root.val;
        }
        
        if(root.left == null && root.right == null)
        {
            paths.add(current);
            return;
        }
        findPath(root.left, current, paths);
        findPath(root.right, current, paths);
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> paths = new ArrayList<>();
        
        findPath(root, new String(), paths);
        
        return paths;
    }
}
