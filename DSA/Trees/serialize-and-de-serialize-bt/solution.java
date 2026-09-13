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
    public String serialize(TreeNode root) {
        if(root==null) return "";

        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        
        {
            TreeNode node=q.poll();
            if(node==null)
            {
                sb.append("#,");
            }else
            {
                sb.append(node.data).append(",");
            q.offer(node.left);
            q.offer(node.right);
            }
        }
        return sb.toString();
        
    }

    public TreeNode deserialize(String data) {
         if (data.isEmpty()) {
            return null;
        }
        String []arr=data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i < arr.length)
        {
             TreeNode node=q.poll();
             if (!arr[i].equals("#")) {
                node.left =  new TreeNode(Integer.parseInt(arr[i]));
                q.add(node.left);
            }
            i++;
             if (i< arr.length && !arr[i].equals("#")) 
             {
                node.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(node.right);
            }
            i++;

        }
        return root;
        
    }
}

/*
 * Your Codec object will be instantiated and called as such:
 * Codec ser = new Codec();
 * Codec deser = new Codec();
 * String tree = ser.serialize(root);
 * TreeNode ans = deser.deserialize(tree);
 * return ans;
 */