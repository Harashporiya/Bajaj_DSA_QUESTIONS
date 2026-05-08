import java.util.ArrayList;

public class GraphDFS {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int v : adj.get(s)) {
            if (!visited[v]) {
                dfs(adj, v, visited);
            }
        }
    }
}