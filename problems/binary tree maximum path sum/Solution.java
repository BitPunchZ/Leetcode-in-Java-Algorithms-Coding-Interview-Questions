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
    
    private int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        solution(root);
        return ans;
    }

    public int solution(TreeNode node){
        if(node==null){
            return 0;
        }

        int left = solution(node.left);
        int right = solution(node.right);

        int mxSide = Math.max(node.val,node.val+Math.max(right,left));

        int mxTop = Math.max(mxSide,left+right+node.val);
        ans = Math.max(ans,mxTop);

        return mxSide;
    }

}
