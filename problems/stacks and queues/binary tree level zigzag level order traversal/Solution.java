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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
          return res;
        }
  
        Deque<TreeNode>q = new LinkedList<>();
        boolean zigzag = false;
        q.add(root);
  
        while(!q.isEmpty()){
          LinkedList<Integer>level = new LinkedList<>();
          int len = q.size();
          while(len>0){
            if(zigzag){
              TreeNode node = q.pollLast();
              level.add(node.val);
              if(node.right != null){
                q.addFirst(node.right);
              }
              if(node.left != null){
                q.addFirst(node.left);
              }
            }else{
              TreeNode node = q.pollFirst();
              level.add(node.val);
              if(node.left != null){
                q.add(node.left);
              }
              if(node.right != null){
                q.add(node.right);
              }
            }
            len--;
          }
          res.add(level);
          zigzag = !zigzag;
        }
  
        return res;
    }
  }