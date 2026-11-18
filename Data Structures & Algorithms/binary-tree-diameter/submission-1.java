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
    
    public  int maxDiametr = 0;
    public  int diameterOfBinaryTree(TreeNode root) {
        getDiametr(root);
        return maxDiametr;
    }

    
    public int getDiametr(TreeNode node){

        if(node == null){
                return 0;
            }
            int left = getDiametr(node.left);
            int right = getDiametr(node.right);
            int sum = left + right;
            maxDiametr = Math.max(sum, maxDiametr);
            return Math.max(left,right)+1;
    }
}

