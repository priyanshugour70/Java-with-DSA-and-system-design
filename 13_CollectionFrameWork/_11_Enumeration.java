import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Collections;

public class _11_Enumeration {
    public static void main(String[] args) {

        // Enumeration is an interface that allows you to traverse elements in a
        // collection, one at a time. It provides two methods hasMoreElements() and
        // nextElement() to access the next element in the collection.

        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Get the Enumeration object
        Enumeration<Integer> en = Collections.enumeration(numbers);

        // Traverse the ArrayList using the Enumeration object
        while (en.hasMoreElements()) {
            Integer num = en.nextElement();
            System.out.println(num);
        }
    }
}