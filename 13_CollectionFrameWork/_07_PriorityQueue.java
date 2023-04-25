import java.util.*;

public class _07_PriorityQueue {
    public static void main(String[] args) {

        //  PriorityQueue
        // ●  It Follow the min heap, it mean internaly it will create a tree based on the priorites.
        // ● The PriorityQueue class implements the Queue interface. 
        // ● It holds the elements or objects which are to be processed by their priorities.
        // ● PriorityQueue doesn't allow null values to be stored in the queue.


        // +---------------+
        // |    Itreable   | (Interface)
        // +---------------+
        //        |
        //        v
        // +---------------+
        // |  Collection   |  (Interface)
        // +---------------+
        //        |
        //        v
        //  +------------+
        //  |   Queue    |  (Interface)
        //  +------------+
        //        |
        //        v
        // +----------------+
        // |  PriorityQueue |  (Class)
        // +----------------+
 
        // create a new priority queue
        PriorityQueue pq = new PriorityQueue();
        //PriorityQueue is a class that implements the Queue interface and represents a queue where the elements are ordered according to their natural ordering or by a specified comparator. The elements with higher priority are dequeued first.



        // offer(E e) - Adds the specified element to the priority queue.
        // add elements to the priority queue
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);

        // print the elements of the priority queue
        System.out.println("Priority Queue: " + pq);

        // peek() - Retrieves, but does not remove, the head of the priority queue, or returns null if the priority queue is empty.
        // access the head of the priority queue
        System.out.println("Head of the Queue: " + pq.peek());

        // poll() - Retrieves and removes the head of the priority queue, or returns null if the priority queue is empty.
        // remove the head of the priority queue
        pq.poll();

        // print the elements of the priority queue again
        System.out.println("Priority Queue after removing the head: " + pq);

        // contains(Object o) - Returns true if the priority queue contains the specified element.
        // check if the priority queue contains a specific element
        System.out.println("Does the Priority Queue contain 5? " + pq.contains(5));

        // remove(Object o) - Removes the first occurrence of the specified element from the priority queue.
        // remove a specific element from the priority queue
        pq.remove(2);

        // print the elements of the priority queue again
        System.out.println("Priority Queue after removing 2: " + pq);

        // size() - Returns the number of elements in the priority queue.
        // get the size of the priority queue
        System.out.println("Size of the Priority Queue: " + pq.size());

        // clear() - Removes all of the elements from the priority queue.
        // clear the priority queue
        pq.clear();

        // isEmpty() - Returns true if the priority queue contains no elements.
        // check if the priority queue is empty
        System.out.println("Is the Priority Queue empty? " + pq.isEmpty());

    }
}

