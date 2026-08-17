
class Solution {
    public List<Integer> preorder(TreeNode root) {
         Stack<TreeNode> st = new Stack<>();
         st.push(root);
         TreeNode node = root;
          List<Integer> preorder = new ArrayList<>();
        if (root == null) {
            return preorder;
        }
          while(!st.empty())
          {
            root=st.pop();
            preorder.add(root.data);

            if(root.right!=null)
            {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
          }
          return preorder;
    }
}