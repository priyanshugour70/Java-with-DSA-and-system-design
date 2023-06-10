import java.util.*;

public class _11_Implementation_Stack_using_Queue {
    public Queue<Integer> q1 = new LinkedList<Integer>();

    public void push(int x) {
        // Get previous size of queue
        int s = q1.size();

        // Push the current element
        q1.add(x);

        // Pop all the previous elements and put them after
        // current element
        for (int i = 0; i < s; i++) {
            q1.add(q1.remove());
        }
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    public void pop() {
        // if no elements are there in q1
        if (!q1.isEmpty())
            q1.remove();
    }

    public int size() {
        return q1.size();
    }

    // driver code
    public static void main(String[] args) {
        _11_Implementation_Stack_using_Queue s = new _11_Implementation_Stack_using_Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println("current size: " + s.size());

        System.out.println("The peek element is : ");
        System.out.println(s.top());
        s.pop();

        System.out.println("The peek element is : ");
        System.out.println(s.top());
        s.pop();

        System.out.println("The peek element is : ");
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}
