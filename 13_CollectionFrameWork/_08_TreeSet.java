import java.util.*;

public class _08_TreeSet {
    public static void main(String[] args) {

        // TreeSet
        // ● TreeSet class implements the Set interface that uses a tree for storage.
        // ● TreeSet also contains unique elements.
        // ● However, the access and retrieval time of TreeSet is quite fast.
        // ● The elements in TreeSet stored in ascending order.
        // ● Underlying Data Structure: BalancedTree
        // ● duplicates : not allowed
        // ● insertion order : not preserved
        // ● heterogeneous element: not possible,if we try to do it would result in
        // "ClassCastException".
        // ● null insertion : possible only once
        // ● Implements Serializable and Cloneable interface,but not RandomAccess.
        // ● All Objects will be inserted based on "some sorting order" or "customised
        // sorting order".

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
        // |    SortedSet   |  (Interface)
        // +----------------+
        //        |
        //        v
        // +----------------+
        // |     TreeSet    |  (Class)
        // +----------------+


        // Create a new TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();

        // Add some elements to the TreeSet
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("orange");
        System.out.println("TreeSet after adding elements: " + treeSet);

        // Add all elements from a collection to the TreeSet
        TreeSet<String> treeSet2 = new TreeSet<String>();
        treeSet2.add("pear");
        treeSet2.add("peach");
        treeSet.addAll(treeSet2);
        System.out.println("TreeSet after adding all elements from another collection: " + treeSet);

        // Check if the TreeSet contains a specific element
        boolean containsApple = treeSet.contains("apple");
        boolean containsGrapes = treeSet.contains("grapes");
        System.out.println("Does TreeSet contain 'apple'? " + containsApple);
        System.out.println("Does TreeSet contain 'grapes'? " + containsGrapes);

        // Get the first and last elements in the TreeSet
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First element in TreeSet: " + firstElement);
        System.out.println("Last element in TreeSet: " + lastElement);

        // Get a view of the portion of the TreeSet whose elements are strictly less than 'banana'
        TreeSet<String> headSet = (TreeSet<String>) treeSet.headSet("banana");
        System.out.println("Elements in headSet: " + headSet);

        // Get a view of the portion of the TreeSet whose elements are greater than or equal to 'orange'
        TreeSet<String> tailSet = (TreeSet<String>) treeSet.tailSet("orange");
        System.out.println("Elements in tailSet: " + tailSet);

        // Get a view of the portion of the TreeSet whose elements range from 'banana' (inclusive) to 'orange' (exclusive)
        TreeSet<String> subSet = (TreeSet<String>) treeSet.subSet("banana", "orange");
        System.out.println("Elements in subSet: " + subSet);

        // Check if the TreeSet is empty
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty? " + isEmpty);

        // Get an iterator over the elements in the TreeSet
        System.out.print("Elements in TreeSet using iterator: ");
        for (String element : treeSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Remove an element from the TreeSet
        boolean removed = treeSet.remove("banana");
        System.out.println("Removed Element is : " + removed);
        System.out.println("TreeSet after removing 'banana': " + treeSet);

        // Remove all elements in a collection from the TreeSet
        TreeSet<String> removeSet = new TreeSet<String>();
        removeSet.add("pear");
        removeSet.add("peach");
        treeSet.removeAll(removeSet);
        System.out.println("TreeSet after removing all elements from another collection: " + treeSet);

        // Retain only the elements in the TreeSet that are contained in a specific collection
        TreeSet<String> retainSet = new TreeSet<String>();
        retainSet.add("banana");
        retainSet.add("orange");
        treeSet.retainAll(retainSet);
        System.out.println("TreeSet after retaining only elements in another collection: " + treeSet);

        // Get the number of elements in the TreeSet
        int size = treeSet.size();
        System.out.println("Number of elements in TreeSet: " + size);


    }
}


