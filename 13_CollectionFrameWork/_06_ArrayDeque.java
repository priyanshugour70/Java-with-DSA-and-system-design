import java.util.*;

// ArrayDeque

// ● ArrayDeque class implements the Deque interface.
// ● It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from
// both the ends.
// ● ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

public class _06_ArrayDeque {

    public static void main(String[] args) {

        // ArrayDeque in Java is a double-ended queue implementation that stores its
        // elements in a resizable array. It provides a set of methods that allow
        // efficient insertion and deletion of elements at both ends of the deque.


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
        //  +------------+
        //  |   Deque    |  (Interface)
        //  +------------+
        //        |
        //        v
        // +----------------+
        // |   ArrayDeque   |  (Class)
        // +----------------+

        ArrayDeque deque = new ArrayDeque();

        // add(); in Deque
        deque.add(1);
        deque.add("Priyanshu");
        deque.add(7.143);
        System.out.println(deque); //

        // addFirst(E e) - Inserts the specified element at the beginning of the deque.
        deque.addFirst("element1");
        deque.addFirst("element2");
        System.out.println(deque);

        // addLast(E e) - Inserts the specified element at the end of the deque.
        deque.addLast("element1");
        deque.addLast("element2");
        System.out.println(deque);

        // offerFirst(E e) - Inserts the specified element at the beginning of the deque
        // and returns true if the operation is successful.
        boolean result = deque.offerFirst("element1");
        System.out.println(result);
        System.out.println(deque);

        // offerLast(E e) - Inserts the specified element at the end of the deque and
        // returns true if the operation is successful.
        boolean result1 = deque.offerLast("element1");
        System.out.println(result1);
        System.out.println(deque);

        // removeFirst() - Retrieves and removes the first element of the deque.
        System.out.println(deque.removeFirst());
        System.out.println(deque);

        // removeLast() - Retrieves and removes the last element of the deque.
        System.out.println(deque.removeLast());
        System.out.println(deque);

        // pollFirst() - Retrieves and removes the first element of the deque, or
        // returns null if the deque is empty.
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        // pollLast() - Retrieves and removes the last element of the deque, or returns
        // null if the deque is empty.
        System.out.println(deque.pollLast());
        System.out.println(deque);

        // getFirst() - Retrieves, but does not remove, the first element of the deque.
        System.out.println(deque.getFirst());
        System.out.println(deque);

        // getLast() - Retrieves, but does not remove, the last element of the deque.
        System.out.println(deque.getLast());
    }
}
