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
    
    boolean balanced = true;
    public  int checkBalance(TreeNode node){
        if  (node == null){
            return 0;
        }
        int left = checkBalance(node.left);
        int right = checkBalance(node.right);
        if (Math.abs(left-right) > 1){
            balanced = false;
        }
        return Math.max(left,right)+1;
    }

    public  boolean isBalanced(TreeNode root) {
        checkBalance(root);
        return balanced;
    }
}
