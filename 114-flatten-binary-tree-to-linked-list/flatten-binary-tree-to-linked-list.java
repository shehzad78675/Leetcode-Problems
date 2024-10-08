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
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.empty()){
            TreeNode node = st.pop();
            if(node.right != null){
                st.push(node.right);
            }
            if(node.left != null){
                st.push(node.left);
            }

            if(!st.empty()){
                node.right = st.peek();
            }
            node.left = null;
        }
    }
}