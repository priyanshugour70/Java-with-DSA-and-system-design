import java.util.*;

public class _09_HashSet {
    public static void main(String[] args) {

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
        //  |    Set     |  (Interface)
        //  +------------+
        //        |
        //        v
        // +----------------+
        // |     HashSet    |  (Class)
        // +----------------+


        // HashSet is a class in the Java Collections Framework that implements the Set interface. It is used to store a collection of unique elements. HashSet is a part of the Java Collection Framework and is widely used because of its high-performance and constant-time complexity for operations like add, remove, and contains.

        // Properties of HashSet: 
        // ● HashSet doesn't allow duplicate elements. If you try to add a duplicate element, it will be ignored.
        // ● HashSet does not guarantee the order of the elements in the set.
        // ● HashSet allows a single null element to be added to the set.
        // ● HashSet is not synchronized, meaning it is not thread-safe. To make a HashSet thread-safe, you can use the Collections.synchronizedSet() method to create a synchronized version of HashSet.
        // ● HashSet uses hashing to store and retrieve elements quickly. This makes HashSet very fast for adding, removing, and searching for elements.
        // ● HashSet is an unordered collection, which means that the order of the elements is not guaranteed to be the same as the order in which they were added.


        // HashSet
        // HashSet class is used to create a collection that uses a hash table for storage. It inherits
        // the AbstractSet class and implements Set interface.
        // The important points about HashSet class are:
        // ● HashSet stores the elements by using a mechanism called hashing.
        // ● HashSet contains unique elements only.
        // ● HashSet allows null value.
        // ● HashSet class is non synchronized.
        // ● The initial default capacity of HashSet is 16, and the load factor is 0.75.


        // Create a new HashSet
        HashSet<String> hashSet = new HashSet<String>();
        
        // Add elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        
        // Check if the HashSet contains a specific element
        boolean containsApple = hashSet.contains("apple"); // true
        boolean containsGrapes = hashSet.contains("grapes"); // false

        // Print
        System.out.println(" hashSet.contains('apple'); " + containsApple);
        System.out.println(" hashSet.contains('grapes'); " + containsGrapes);
        
        // Create a new HashSet and add elements to it
        HashSet<String> otherHashSet = new HashSet<String>();
        otherHashSet.add("pear");
        otherHashSet.add("peach");
        
        // Add all the elements from one HashSet to another HashSet
        hashSet.addAll(otherHashSet);
        
        // Remove an element from the HashSet
        boolean removed = hashSet.remove("banana");

        // Print
        System.out.println("hashSet.remove('banana') ; " + removed);
        
        // Remove all the elements in the specified collection from the HashSet
        HashSet<String> removeSet = new HashSet<String>();
        removeSet.add("pear");
        removeSet.add("peach");
        hashSet.removeAll(removeSet);
        
        // Retain only the elements in the HashSet that are contained in the specified collection
        HashSet<String> retainSet = new HashSet<String>();
        retainSet.add("apple");
        retainSet.add("orange");
        hashSet.retainAll(retainSet);
        
        // Get the size of the HashSet
        int size = hashSet.size();

        // Print
        System.out.println("Size of the HashSet : " + size);
        
        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();

        // Print
        System.out.println("Check HashSet is Empty or not : " + isEmpty);

        // Create an iterator over the elements in the HashSet
        Iterator<String> iterator = hashSet.iterator();
        
        // Loop through the HashSet using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        
        // Clear all the elements in the HashSet
        hashSet.clear();
    }
}


