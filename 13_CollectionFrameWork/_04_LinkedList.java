import java.util.*;

public class _04_LinkedList {
    public static void main(String[] args) {
        // LiskedList :- Follow the (Doubly linkedlist DataStracture)

        // LinkedList is a class in the Java Collections Framework that implements the
        // List interface and Deque interface(Parent of Deque is Queue interface) . It
        // is an implementation of a doubly linked list, which means that each element
        // in the list has a reference to both the previous and the next element in the
        // list.

        // LinkedList is different from ArrayList in several ways:

        // ● Underlying data structure: LinkedList uses a doubly linked list to store
        // its elements, while ArrayList uses an array.

        // ● Performance: LinkedList is more efficient than ArrayList for operations
        // that involve inserting or removing elements in the middle of the list, as it
        // does not require elements to be shifted to accommodate these operations.
        // However, ArrayList is generally more efficient than LinkedList for operations
        // that involve accessing elements at random positions, as accessing an element
        // in an array is a constant-time operation.

        // ● Memory usage: LinkedList typically uses more memory than ArrayList because
        // each element in the list has to maintain references to its previous and next
        // elements.

        // Creating a LinkedList
        LinkedList linkedList = new LinkedList();

        // Adding elements to the LinkedList
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Hello");
        linkedList.add("hello");
        linkedList.add("Hello");
        linkedList.add("Charlie");

        // Accessing elements in the LinkedList
        System.out.println(linkedList.get(0)); // Alice
        System.out.println(linkedList.get(1)); // Bob
        System.out.println(linkedList.get(2)); // Hello

        // IndexOf in LinkedList
        System.out.println(linkedList.indexOf("Hello"));

        // lastIndexOf in LinkedList
        System.out.println(linkedList.lastIndexOf("Hello"));

        // Adding an element at a specific index
        linkedList.add(1, "David");

        System.out.println(linkedList);

        // Removing an element from the LinkedList
        linkedList.remove("Bob");

        System.out.println(linkedList);

        // some key features of LinkedList in Java Collections:

        // ● Implements the List interface using a doubly linked list data structure.
        // ● Efficient for inserting or removing elements in the middle of the list.
        // ● Supports both add and remove operations at both ends of the list (head and
        // tail).
        // ● Slower than ArrayList for accessing elements at random positions.
        // ● Uses more memory than ArrayList due to the overhead of maintaining node
        // references.
    }
}
