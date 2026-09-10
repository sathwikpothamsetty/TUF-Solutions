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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parentmap=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
              TreeNode node=q.poll();

              if(node.left!=null)
              {
                parentmap.put(node.left,node);
                q.add(node.left);
              }
              if(node.right!=null)
              {
                parentmap.put(node.right,node);
                q.add(node.right);
              }
        }
        List<Integer>res=new ArrayList<>();
        Set<TreeNode> vis=new HashSet<>();
        q.add(target);
        vis.add(target);
        int currdist=0;

        while(!q.isEmpty())
        {
            if(currdist==k)
            {
                while(!q.isEmpty())
                {
                    res.add(q.poll().data);
                }
                return res;
            }
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                if(node.left!=null && !vis.contains(node.left))
                {
                     q.add(node.left);
                     vis.add(node.left);
                }
                 if (node.right != null && !vis.contains(node.right)) {
                    q.add(node.right);
                    vis.add(node.right);
                }
                if(parentmap.containsKey(node)&& !vis.contains(parentmap.get(node)))
                {
                    q.add(parentmap.get(node));
                    vis.add(parentmap.get(node));
                }
        
        }
        currdist++;

     }
        return res;
}
}