import java.util.PriorityQueue;

public class _05_PriorityQueue_min {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // By default, it is a min priority queue

        pq.add(20); // O(logn)
        pq.add(30);
        pq.add(50);
        pq.add(10);
        pq.add(40);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }

    }
}