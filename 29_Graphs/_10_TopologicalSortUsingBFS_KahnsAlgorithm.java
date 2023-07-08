
import java.util.*;

public class _10_TopologicalSortUsingBFS_KahnsAlgorithm {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; graph.length > i; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topologicalSortKahnsAlgorithm(ArrayList<Edge>[] graph) {
        int indegree[] = new int[graph.length];
        calcIndegree(graph, indegree);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // BFS -> 1. Get + Remove, 2. Mark*, 3. Work, 4. Add*
        while (!q.isEmpty()) {
            int curr = q.remove(); // 1. Get + Remove
            System.out.println(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) { // 2. Mark*
                Edge e = graph[curr].get(i); // 3. Work
                indegree[e.dest]--; // 4. Add*
                if (indegree[e.dest] == 0) { // 5. Check
                    q.add(e.dest); // 6. Add*
                }
            }
        }

    }

    public static void calcIndegree(ArrayList<Edge>[] graph, int indegree[]) {
        for (int i = 0; graph.length > i; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indegree[e.dest]++;
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topologicalSortKahnsAlgorithm(graph);
    }
}
