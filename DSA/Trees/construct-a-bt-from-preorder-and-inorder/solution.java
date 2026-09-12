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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //your code goes here
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            mpp.put(inorder[i],i);
        }
        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mpp);
        return root;
    }
    private TreeNode buildTree(int[] preorder,int preStart,int preend,int[] inorder,int instart,int inend, Map<Integer,Integer> mpp)
    {

        if(preStart>preend || instart>inend ) return null;
        
        TreeNode root=new TreeNode(preorder[preStart]);
        int inroot=mpp.get(root.data);
        int numsleft=inroot - instart;

        root.left=buildTree(preorder,preStart+1,preStart+numsleft,
        inorder,instart,inroot-1,mpp);

        root.right=buildTree(preorder,preStart+numsleft+1,preend,

        inorder,inroot+1,inend,mpp);


        return root;
      

    }
}