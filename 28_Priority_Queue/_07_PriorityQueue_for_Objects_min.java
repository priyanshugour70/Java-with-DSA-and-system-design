import java.util.*;

public class _07_PriorityQueue_for_Objects_min {
    static class Student implements Comparable<Student> { // Overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student o) {
            return this.rank - o.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("D", 40));
        pq.add(new Student("A", 10));
        pq.add(new Student("C", 30));
        pq.add(new Student("E", 50));
        pq.add(new Student("B", 20));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " --> " + pq.peek().rank);
            pq.remove();
        }
    }
}
