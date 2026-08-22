/**
 * Definition for a binary tree node. public class TreeNode { int data; TreeNode left; TreeNode
 * right; TreeNode(int val) { data = val; left = null, right = null } }
 */
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) 
  {
     List<List<Integer>> ans = new ArrayList<>();

     if (root == null) 
     return ans;

     Queue<TreeNode> q = new LinkedList<>();
     q.add(root);
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
      ans.add(lv);
      }
      return ans;
  }
}
