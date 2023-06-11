import java.util.ArrayDeque;
import java.util.Deque;

public class _12_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        int first = deque.removeFirst();
        int last = deque.removeLast();
        System.out.println("First: " + first + ", Last: " + last);
    }
}
