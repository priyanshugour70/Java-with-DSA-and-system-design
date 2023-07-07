import java.util.ArrayList;
import java.util.Scanner;

public class _01_Graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {

        int V = 5; // Enter number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V]; // null -> empty arraylist

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> Vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 -> Vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -> Vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        // 3 -> Vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -> Vertex
        graph[4].add(new Edge(4, 2, 2));

        // Display neighbours of a vertex
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertex : ");
        int neighbours = sc.nextInt();

        /*
         * // using for each loop
         * for (Edge e : graph[neighbours]) {
         * System.out.println(e.src + " " + e.dest + " " + e.wt);
         * }
         */

        // using for loop
        for (int i = 0; i < graph[neighbours].size(); i++) {
            Edge e = graph[neighbours].get(i); // src, dest, wt
            System.out.println("Element : " + e.src + " || Neighbours : " + e.dest + " || Weight : " + e.wt);
        }

        sc.close();
    }
}