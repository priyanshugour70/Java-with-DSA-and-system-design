import java.util.*;

public class _10_LinkedHashSet {
    public static void main(String[] args) {
        // LinkedHashSet is a class that extends HashSet and provides a collection that is ordered and has no duplicate elements. It is an implementation of the Set interface that maintains the insertion order of elements, which means that when iterating over a LinkedHashSet, the elements will be returned in the order in which they were inserted.
    
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
        // |  LinkedHashSet |  (Class)
        // +----------------+
    
        // Properties of LinkedHashSet:
        // ● LinkedHashSet maintains a doubly-linked list of its elements, in addition to the hash table that is used by HashSet.
        // ● The order of elements in the LinkedHashSet is the order in which they were inserted.
        // ● LinkedHashSet has constant-time performance for the basic operations (add, remove, contains) assuming a good hash function is provided.
        // ● The iteration order is the order in which elements were inserted.
    
        
        // Differences between HashSet and LinkedHashSet:
        // ● HashSet does not maintain any order of elements while LinkedHashSet maintains the order of insertion.
        // ● HashSet has slightly better performance than LinkedHashSet for basic operations (add, remove, contains), but LinkedHashSet has slightly worse performance for iteration.
        // ● HashSet does not maintain any extra data structure to maintain order while LinkedHashSet maintains a doubly-linked list of its elements in addition to the hash table.
    
    
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // Printing the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Adding a duplicate element
        linkedHashSet.add("Banana");

        // Printing the LinkedHashSet after adding a duplicate element
        System.out.println("LinkedHashSet after adding a duplicate element: " + linkedHashSet);

        // Removing an element from LinkedHashSet
        linkedHashSet.remove("Cherry");

        // Printing the LinkedHashSet after removing an element
        System.out.println("LinkedHashSet after removing an element: " + linkedHashSet);

        // Checking if LinkedHashSet contains an element
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("LinkedHashSet contains 'Banana': " + containsBanana);

        // Iterating over the LinkedHashSet using enhanced for-loop
        System.out.print("Iterating over the LinkedHashSet using enhanced for-loop: ");
        for(String element : linkedHashSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clearing the LinkedHashSet
        linkedHashSet.clear();

        // Printing the LinkedHashSet after clearing it
        System.out.println("LinkedHashSet after clearing it: " + linkedHashSet);
    
    
    }
}

