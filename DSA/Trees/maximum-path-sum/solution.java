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
    int maxsum=Integer.MIN_VALUE;

    private int max(TreeNode root)
    {
        if(root==null) return 0;
        int ls=Math.max(0,max(root.left));
        int rs=Math.max(0,max(root.right));

        maxsum=Math.max(maxsum,ls+rs+root.data);

        return Math.max(ls,rs)+root.data;
    }
    public int maxPathSum(TreeNode root) {
        max(root);
        return maxsum;
    }
}