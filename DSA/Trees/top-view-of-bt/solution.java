class Pair {
    TreeNode node;
    int col;

    Pair(TreeNode node, int col) {
        this.node = node;
        this.col = col;
    }
}

class Solution {

    public List<Integer> topView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair p = q.poll();

            TreeNode node = p.node;
            int col = p.col;

            if (!map.containsKey(col)) {
                map.put(col, node.data);
            }

            if (node.left != null) {
                q.add(new Pair(node.left, col - 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, col + 1));
            }
        }

       
        for (int value : map.values()) {
            ans.add(value);
        }

        return ans;
    }
}