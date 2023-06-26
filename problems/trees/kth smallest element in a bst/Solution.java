/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int k;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        
      this.k = k;
      this.helper(root);
      return this.res;
  
    }
    public void helper(TreeNode root){
      if(root==null){
        return;
      }
      this.helper(root.left);
      this.k -= 1;
      if(this.k == 0){
        this.res = root.val;
        return;
      }
      this.helper(root.right);
    }
  }