Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

/************************************************/


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.add(root);     
       
        
        while (!q.isEmpty()) {

            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            List<Integer> current = new ArrayList<Integer>();
            
            for (TreeNode curr : q) {
                current.add(curr.val);
                if (curr.left != null) {
                    temp.add(curr.left);
                }
                if (curr.right != null) {
                    temp.add(curr.right);
                }
            }            
          
            result.add(current);
            q = temp;
        }
        
        return result;
    }
    
   
        
       
}
