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

        private void  ri(TreeNode root,List<Integer>arr)
    {
        if(root==null) return ;

        ri(root.left,arr);
        ri(root.right,arr);
        arr.add(root.data);
    }
    public List<Integer> postorder(TreeNode root) {
        //your code goes here

          List<Integer> arr=new ArrayList<>();

        ri(root,arr);
        return arr;
    }
}