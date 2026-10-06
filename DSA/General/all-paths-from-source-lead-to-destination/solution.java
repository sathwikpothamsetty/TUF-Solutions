class Solution {
  
    private enum Color { GRAY, BLACK } 
    
    private boolean leadsToDest(List<List<Integer>> graph, int node, 
    int dest, Color[] states) {
     
        if (states[node] != null) {
            return states[node] == Color.BLACK;
        }
       
        if (graph.get(node).isEmpty()) {
            return node == dest;
        }
        
     
        states[node] = Color.GRAY;
       
        for (int next : graph.get(node)) {
            if (!leadsToDest(graph, next, dest, states)) {
                return false;
            }
        }
    
        states[node] = Color.BLACK;
        return true;
    }

    private List<List<Integer>> buildDigraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }
        return graph;
    }
    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = buildDigraph(n, edges);
        Color[] states = new Color[n];  
        return leadsToDest(graph, source, destination, states);
    }
}
