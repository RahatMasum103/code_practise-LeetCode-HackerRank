Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3

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
    public int kthSmallest(TreeNode root, int k) {
        TreeSet<Integer> tset = new TreeSet();
        
        recursive(root, tset);
        
        int num = 0;
        for(int i=1; i<=k; i++)
        {
            num = tset.pollFirst(); // first element and remove
        }
        
        return num;
    }
    
    private void recursive(TreeNode root, TreeSet<Integer> ts)
    {
        if(root == null)
            return;
        
        ts.add(root.val); // ascending order Set without duplicate
        
        recursive(root.left, ts);
        recursive(root.right, ts);
    }
}
