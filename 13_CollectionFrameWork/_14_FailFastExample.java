import java.util.ArrayList;

public class _14_FailFastExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (int i : list) {
            System.out.println(i);
            list.add(4); // Throws ConcurrentModificationException
        }

        // In the for loop, you are iterating over the list using the enhanced for loop
        // syntax (for-each loop), which internally uses an iterator. At the same time,
        // you are trying to add an element to the list using the add() method, which
        // modifies the list while it is being iterated over.

        // This violates the fail-fast behavior of the ArrayList collection, which is
        // designed to throw a ConcurrentModificationException if the list is modified
        // while it is being iterated over.

    }
}
