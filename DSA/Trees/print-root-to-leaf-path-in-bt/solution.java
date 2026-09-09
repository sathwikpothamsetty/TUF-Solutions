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

    public List<List<Integer>> allRootToLeaf(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        List<Integer> path = new ArrayList<>();

        dfs(root, path, ans);

        return ans;
    }

    private void dfs(TreeNode node, List<Integer> path,
                     List<List<Integer>> ans) {

        if (node == null)
            return;

       
        path.add(node.data);

        
        if (node.left == null && node.right == null) {
            ans.add(new ArrayList<>(path));
        }

        else
        {

        dfs(node.left, path, ans);

       
        dfs(node.right, path, ans);
        }

         path.remove(path.size()-1);
        
    }
}