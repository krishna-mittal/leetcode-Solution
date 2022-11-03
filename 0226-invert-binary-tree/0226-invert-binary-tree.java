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
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }
    public TreeNode helper(TreeNode curr)
    {
        if(curr == null) return null;
        TreeNode left = helper(curr.left);
        TreeNode right = helper(curr.right);
        curr.right = left;
        curr.left = right;
        return curr;
    }
}