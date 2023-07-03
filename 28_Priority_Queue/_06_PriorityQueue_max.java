import java.util.*;

public class _06_PriorityQueue_max {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // using Camaparator.reverseOrder() for reverse ordering :- max heap

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