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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //your code goes here
         List<List<Integer>> ans = new ArrayList<>();

     if (root == null) 
     return ans;

     Queue<TreeNode> q = new LinkedList<>();
     q.add(root);
     boolean lefttoright=true;
     while (!q.isEmpty())
      {
        List<Integer> lv = new ArrayList<>();
         int size = q.size();
         for (int i = 0; i < size; i++) 
         {
           TreeNode node = q.poll();
           lv.add(node.data);
          if (node.left != null)
           {
            q.add(node.left);
           }
          if (node.right != null) 
          {
           q.add(node.right);
          }
        }
        if(!lefttoright)
        {
            Collections.reverse(lv);
        }
      ans.add(lv);
       lefttoright = !lefttoright; 
      }
      return ans;
    }
}