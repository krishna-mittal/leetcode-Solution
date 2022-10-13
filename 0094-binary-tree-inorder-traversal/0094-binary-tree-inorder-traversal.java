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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        // if(root == null)
        // {
        //     return;
        // }
        // inorderTraversal(root.left);
        // System.out.println(root.val+" ");
        // inorderTraversal(root.right);
        
//         List<Integer> res  = new ArrayList<>();
//         helper(root, res);
//         return res;
//     }
//     private void helper(TreeNode node, List<Integer> list)
//     {
//         if(node == null){return ;}
        
//         helper(node.left, list);
//         list.add(node.val);
//         helper(node.right, list);
        
        
        
//         if(root == null)
// 	        return;

//         Stack<TreeNode> stack = new Stack<>();

//         TreeNode temp =  root;

//         while(!stack.isEmpty() || temp != null)
//         {
// 	        if(temp != null)
// 	        {
// 		        stack.push(temp);
// 		        temp  = temp.left;
// 	        }	
// 	        else
// 	        {
// 		        temp = stack.pop();
// 		        System.out.println(temp.data + " ");
// 		        temp = temp.right;
// 	        }
//         }
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty())
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
        
        
    }
}