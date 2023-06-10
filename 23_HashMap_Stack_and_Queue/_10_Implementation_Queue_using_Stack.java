// Implementation of Queue Data Structure using Stack
// time complexity of enQueue: O(1)
// time complexity of deQueue: O(n)
// space complexity: O(n)

import java.util.*;

public class _10_Implementation_Queue_using_Stack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // insertion of the data in the queue
    // time complexity : O(1)
    public void enQueue(int data) {
        stack1.push(data);
    }

    // deletion of the data from the queue - FIFO
    public int deQueue() {
        int ele;
        if (stack1.empty() && stack2.empty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        // Push all the elements from stack1 to stack2
        // time complexity : O(n)
        if (stack2.empty()) {
            while (!stack1.empty()) {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }

        // Pop the top element from stack2
        // FIFO - First In First Out
        ele = stack2.pop();
        return ele;

    }

    public static void main(String[] args) {
        _10_Implementation_Queue_using_Stack q = new _10_Implementation_Queue_using_Stack();

        // function calling for insertion in the queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        // function calling for deletion of an element from the queue
        System.out.println("Deleted element is:" + q.deQueue());
        System.out.println("Deleted element is:" + q.deQueue());

    }
}
