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
    public int timeToBurnTree(TreeNode root, int start) {
        Map<TreeNode,TreeNode> parentmap=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode startnode=null;
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node.data==start)
            {
                startnode=node;
            }
            if(node.left!=null)
            {
                parentmap.put(node.left,node);
                q.offer(node.left);
            }

              if(node.right!=null)
            {
                parentmap.put(node.right,node);
                q.offer(node.right);
            }
        }

        int time=0;
        Set<TreeNode> vis=new HashSet<>();
        q.add(startnode);
        vis.add(startnode);

        while(!q.isEmpty())
        {
            int size=q.size();

            for(int i=0;i<size;i++)
            {
               TreeNode node=q.poll();
                if(node.left!=null && !vis.contains(node.left))
                {
                    vis.add(node.left);
                    q.add(node.left);
                }
                 if(node.right!=null && !vis.contains(node.right))
                {
                    vis.add(node.right);
                    q.add(node.right);
                }

                if(parentmap.containsKey(node)&& !vis.contains(parentmap.get(node)))
                {
                    vis.add(parentmap.get(node));
                    q.add(parentmap.get(node));
                }
            }
            time++;
        }
        return time-1;
        //your code goes here
    }
}