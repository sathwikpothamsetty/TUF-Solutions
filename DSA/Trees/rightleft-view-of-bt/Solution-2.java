class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        dfsRight(root, 0, ans);

        return ans;
    }

    private void dfsRight(TreeNode root, int level, List<Integer> ans) {

        if (root == null)
            return;
        if (ans.size() == level) {
            ans.add(root.data);
        }

      
        dfsRight(root.right, level + 1, ans);
        dfsRight(root.left,level+1,ans);
    }
}