// Implementation of Queue Data Structure using Stack
// time complexity of enQueue: O(1)
// time complexity of deQueue: O(n)
// space complexity: O(n)

import java.util.*;

public class _10_Implementation_Queue_using_Stack {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void enQueue(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // Push item into s1
        s1.push(x);

        // Push everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue an item from the queue
    public int deQueue() {
        // if first stack is empty
        if (s1.isEmpty()) {
            System.out.println("Q is Empty.");
            System.exit(0);
        }
        // Return top of s1
        int x = s1.peek();
        s1.pop();
        return x;
    }

    public static void main(String[] args) {
        _10_Implementation_Queue_using_Stack q = new _10_Implementation_Queue_using_Stack();

        q.enQueue(1);
        System.out.println(q.s1.peek());
        System.out.println(q.deQueue());

        q.enQueue(2);
        System.out.println(q.s1.peek());
        System.out.println(q.deQueue());

        q.enQueue(3);
        System.out.println(q.s1.peek());
        System.out.println(q.deQueue());

        q.enQueue(4);
        System.out.println(q.s1.peek());
        System.out.println(q.deQueue());

        q.enQueue(6);
        System.out.println(q.s1.peek());
        System.out.println(q.deQueue());

        q.enQueue(5);
        System.out.println(q.s1.peek());
        System.out.println(q.deQueue());
    }
}
