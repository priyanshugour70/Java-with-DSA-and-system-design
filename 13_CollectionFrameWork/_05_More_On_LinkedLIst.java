import java.util.*;

public class _05_More_On_LinkedLIst {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        // add(); (using List interface)
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        // addFirst(); (using Deque interface)
        ll.addFirst("Hello");
        ll.addLast("Good Luck");

        // Add value on the index.
        ll.add(1, "Guyz..");

        // To get first object in LinkedList without disturb or remove other Object in
        // Collection.
        System.out.println(ll.peek());

        // To get first object in LinkedList but in this method the first object was
        // removed form Collection in the LinkedList.
        System.out.println(ll.poll());

        // Print a LinkedList
        System.out.println(ll);

        // push(); in LinkedList push add object to Starting of the collection.
        ll.push("DevanshuGour");

        System.out.println(ll);

        // pop(); in LinkedList pop remove the first object of the collection.
        System.out.println(ll.pop());

        System.out.println(ll);

        // LinkedList
        //
        // ● LinkedList implements the List and Deque interface.
        // ● It uses a doubly linked list internally to store the elements.
        // ● It can store the duplicate elements.
        // ● It maintains the insertion order and is not synchronized.
        // ● In LinkedList, the manipulation is fast because no shifting is required.

    }
}
