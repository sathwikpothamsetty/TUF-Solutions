/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> postorder(TreeNode root) {
        //your code goes here
        List<Integer> result=new ArrayList<>();
         Stack<TreeNode> nodeStack = new Stack<>();
        if(root!=null)
         nodeStack.push(root);

         while(!nodeStack.isEmpty())
         {
            TreeNode node = nodeStack.pop();
            result.add(node.data);
            if (node.left != null) nodeStack.push(node.left);
            if (node.right != null) nodeStack.push(node.right);
         }
         Collections.reverse(result);
         return result;
    }
}