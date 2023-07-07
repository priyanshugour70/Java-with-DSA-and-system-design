// in this program we will detect cycle in undirected graph using DFS
// Time Complexity: O(V+E)
// Space Complexity: O(V+E)

import java.util.*;

public class _06_CycleDetectionUndirectedGraphDFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        
/*
         *      0-------3
         *     /|       |
         *   /  |       |
         * 1    |       |
         *   \  |       4
         *     \|       
         *      2
*/

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, visited, i, -1)) {
                    return true;
                    // cycle detect in this component
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean visited[], int curr, int parent) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // Case 3: If the destination is visited and it is not the parent of the current
            // node
            if (!visited[e.dest]) {
                if (detectCycleUtil(graph, visited, e.dest, curr)) {
                    return true;
                }
            }
            // Case 2: If the destination is visited and it is the parent of the current
            // node
            else if (visited[e.dest] && e.dest != parent) {
                return true;
            }
            // Case 1: If the destination is not visited
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));

    }
}
