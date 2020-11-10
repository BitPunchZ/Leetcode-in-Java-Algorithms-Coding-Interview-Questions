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
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> ans = new ArrayList<Integer>();
      if(root==null) return ans;
  
      Stack<TreeNode>s1 = new Stack<TreeNode>();
      Stack<TreeNode>s2 = new Stack<TreeNode>();
  
      s1.push(root);
  
      while(!s1.isEmpty()){
        TreeNode x = s1.pop();
        s2.push(x);
        if(x.left != null){
          s1.push(x.left);
        }
        if(x.right != null){
          s1.push(x.right);
        }
      }
  
      while(!s2.isEmpty()){
        TreeNode y = s2.pop();
        ans.add(y.val);
      }
  
      return ans;
    }
  }