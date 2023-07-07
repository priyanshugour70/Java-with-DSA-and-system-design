import java.util.*;

public class _03_DFS_Graph {

    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // O(V+E) --> Adjecency List || O(V^2) --> Adjecency Matrix
    public static void DepthFirstSearch(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        // Visit curr
        System.out.print(curr + " ");

        // Mark curr as visited
        visited[curr] = true;

        // Visit all unvisited nbrs
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.nbr]) {
                DepthFirstSearch(graph, e.nbr, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 7; // no of vertices
        ArrayList<Edge> graph[] = new ArrayList[V]; // array of ArrayLists

        createGraph(graph); // create graph

        DepthFirstSearch(graph, 0, new boolean[V]); // graph, src, visited array
        System.out.println();
    }

}