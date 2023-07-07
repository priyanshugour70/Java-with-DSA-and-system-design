// in this program we will check if the graph is bipartite or not
// a graph is bipartite if it can be divided into two sets such that
// no two nodes in the same set are connected by an edge
// Time Complexity: O(V + E)
// Space Complexity: O(V)

import java.util.*;

public class _07_BipartiteGraph {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
/*
                0 -------- 2
              /          /
            /          /
           1          4
            \        /
              \     /
                \  /   
                  3
            FALSE
*/

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int color[] = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { // BFS
                q.add(i);
                color[i] = 0; // 0 for yellow , 1 for blue
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (color[e.dest] == -1) {
                            int nextColor = color[curr] == 0 ? 1 : 0; // if curr is yellow, nextColor is blue
                            color[e.dest] = nextColor;
                            q.add(e.dest);
                        } else if (color[e.dest] == color[curr]) {
                            return false; // if the color of the nbr is same as the curr node, then the graph is not
                                          // bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[5];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
