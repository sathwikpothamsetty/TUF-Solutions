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

    int fdia = 0;

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        fdia = Math.max(fdia, left + right);

        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return fdia;
    }
}