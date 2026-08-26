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

    public void inorder(TreeNode root,int[] cnt)
    {
        if(root==null) return;

        cnt[0]++;
        inorder(root.right,cnt);
        inorder(root.left,cnt);
    }
    public int countNodes(TreeNode root) {
        //your code goes here
         if (root == null) {
            return 0;
        }
     int cnt[]={0};

     inorder(root,cnt);

     return cnt[0];
    }
}