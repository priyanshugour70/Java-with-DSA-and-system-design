import java.util.ArrayList;
import java.util.Iterator;

public class _12_Iterator {
    public static void main(String[] args) {

        // an Iterator is an interface that is used to traverse a collection of
        // elements, such as an ArrayList, LinkedList, or HashSet. It provides a way to
        // access each element of the collection sequentially without exposing the
        // underlying data structure.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
        // we first create an ArrayList of integers, and then create an Iterator by
        // calling the iterator() method on the ArrayList. We then use a while loop to
        // iterate over each element in the ArrayList, calling hasNext() to check if
        // there is another element, and next() to retrieve the next element
    }
}
