// In Kruskal's Algorithm we find the minimum cost of the tree this is based on greedy approach. using union find algorithm
// Time Complexity :- O(ElogE)
// Space Complexity :- O(E)

import java.util.*;

public class _15_KruskalsAlgorithm {

    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt; // Ascending Order
        }
    }

    public static void createGraph(ArrayList<Edge> graph) {
        // Edges..
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 30));
    }

    static int n = 4; // no of vertices
    static int par[] = new int[n]; // parent array
    static int rank[] = new int[n]; // rank array

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parA] = parB;
            rank[parB]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void KruskalsAlgorithm(ArrayList<Edge> graph, int V) {

        init();

        Collections.sort(graph);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) {
            Edge e = graph.get(i);

            // (src, dest, wt)
            int parA = find(e.src); // src = a
            int parB = find(e.dest); // dest = b

            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }

        System.out.println(mstCost);

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);

        KruskalsAlgorithm(graph, V);

    }
}
