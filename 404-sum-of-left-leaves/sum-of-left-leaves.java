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
    int sum = 0;
    public void leftSum(TreeNode root, boolean check){
        if(root == null){
            return;
        }

        if(check && root.left == null && root.right == null){
            sum += root.val;
        }
        leftSum(root.left, true);
        leftSum(root.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        leftSum(root, false);
        return sum;
    }
}