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
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasSum(root, sum, 0);
    }

    public boolean hasSum(TreeNode node, int sum, int cur) {
        if(node==null)
          return false;
        cur += node.val;

        if(cur==sum && node.left==null && node.right == null)
          return true;
        
        return (hasSum(node.right,sum,cur) || hasSum(node.left,sum,cur));
    }
}