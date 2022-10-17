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
        // Recursive Method
        
        // if(root == null)
        // {
        //     return;
        // }
        // postOrder(root.left);
        // postOrder(root.right);
        // System.out.print(root.data + " ");
        
        // CODE
        
    //     List<Integer> res = new ArrayList<>();
    //     travel(res, root);
    //     return res;
    // }
    // public static void travel(List<Integer> res, TreeNode node)
    // {
    //     if(node == null)
    //     {
    //         return;
    //     }
    //     travel(res, node.left);
    //     travel(res, node.right);
    //     res.add(node.val);
        
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){ return ans;}
        
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            ans.addFirst(temp.val);
            if(temp.left != null)
            {
                stack.push(temp.left);
            }
            if(temp.right != null)
            {
                stack.push(temp.right);
            }
        }
        return ans;
    }
}