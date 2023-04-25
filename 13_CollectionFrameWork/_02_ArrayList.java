import java.util.*;

// ArrayList is a built-in class in Java that allows us to create a resizable dynamic array. It is part of the Java Collections framework, and provides many methods to manipulate elements in the array. 

public class _02_ArrayList {
    public static void main(String[] args) {

        // ArrayList

        // ● The ArrayList class implements the List interface.
        // ● It uses a dynamic array to store the duplicate element of different data
        // types.
        // ● The ArrayList class maintains the insertion order and is non-synchronized.
        // ● The elements stored in the ArrayList class can be randomly accessed.

        // create an ArrayList of Strings
        ArrayList list = new ArrayList();

        // add elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // access an element in the ArrayList
        System.out.println("Element at index 1: " + list.get(1));

        // Length or size of the List
        System.out.println("Length/Size of the List : " + list.size());

        // remove nth index of an element from the ArrayList
        list.remove(0);

        // Print the whole list .
        System.out.println("List is : " + list);

        // Create a New List
        ArrayList list1 = new ArrayList();

        // Add elements to the ArrayList
        list1.add("Hey..!");
        list1.add(1243);
        list1.add(true);
        list1.add(123.321);

        // print the whole list1
        System.out.println("List1 is : " + list1);

        // Add value on particuler index and remaining are swifted.
        list1.add(0, "Priyansu Gour");

        // Add two ArrayList;
        list.addAll(list1);

        // Print Both list which is added in list ;
        System.out.println("Mixup of two list : " + list);

        // clear all elements from the ArrayList
        list.clear();

        // check if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("ArrayList is empty");
        }
    }
}
