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
    public boolean isBalanced(TreeNode root) {
        //your code goes here
        return dfs(root)!=-1;
	}
    private int dfs(TreeNode root)
    {
        if(root==null) return 0;

        int l=dfs(root.left);
         if (l== -1) return -1;
        int r=dfs(root.right);
          if (r== -1) return -1;
        if(Math.abs(l-r)>1) return -1;

        return Math.max(l,r)+1;
    }
}