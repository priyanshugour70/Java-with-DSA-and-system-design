import java.util.*;

// ListIterator this only available on list interface

public class _13_ListIterator {
    public static void main(String[] args) {

        // The ListIterator interface in Java provides a way to iterate over the
        // elements of a list and modify the list while iterating. It extends the
        // Iterator interface and adds additional methods for bidirectional iteration
        // and modification.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ListIterator<Integer> iterator = numbers.listIterator();

        System.out.println("Printing the iterator Collection Starting to Ending");
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
        }

        System.out.println("Printing the iterator Collection Ending to Starting");
        while (iterator.hasPrevious()) {
            int num = iterator.previous();
            System.out.println(num);
        }

        ListIterator<Integer> iterator1 = numbers.listIterator(numbers.size());
        System.out.println("Printing the iterator Collection Ending to Starting in different Sineario");
        while (iterator1.hasPrevious()) {
            int num = iterator1.previous();
            System.out.println(num);
        }

        // In this example, we create an ArrayList of integers and add some numbers to
        // it. We then create a ListIterator object using the listIterator() method of
        // the ArrayList. We use the hasNext() and next() methods to iterate over the
        // elements of the list and print them out. We then use the hasPrevious() and
        // previous() methods to iterate over the elements of the list in reverse order
        // and print them out.

        // Inserting elements while iterating:
        System.out.println("in iterator Collection Inserting elements");
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 3) {
                iterator.add(6);
            }
        }
        // In this scenario, we are iterating over the list and adding an element (6)
        // after the element with value 3. This will modify the list and insert the
        // element at the appropriate position.

        // Removing elements while iterating:
        System.out.println("in iterator Collection Removing elements");
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 2) {
                iterator.remove();
            }
        }
        // In this scenario, we are iterating over the list and removing elements that
        // are even. This will modify the list and remove the appropriate elements.

        // Updating elements while iterating:
        System.out.println("in iterator Collection Updating elements");
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 3) {
                iterator.set(7);
            }
        }
        // In this scenario, we are iterating over the list and updating the element
        // with value 3 to be 7. This will modify the list and update the appropriate
        // element.

    }
}
