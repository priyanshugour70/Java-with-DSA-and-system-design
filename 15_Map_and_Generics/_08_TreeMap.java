import java.util.TreeMap;

public class _08_TreeMap {
    // a TreeMap is a class that implements the SortedMap interface and is based on
    // a Red-Black tree data structure. It is a map that stores key-value pairs,
    // where the keys are sorted in their natural order or according to a custom
    // comparator specified during its creation.

    // The TreeMap class has several properties that distinguish it from other map
    // classes:

    // Sorted order: The keys in a TreeMap are sorted in a specific order, either by
    // their natural order or by a custom comparator.

    // Fast operations: Because the keys are stored in a Red-Black tree, the time
    // complexity of operations like get, put, remove, and containsKey is O(log n),
    // making them efficient even for large maps.

    // Null keys not allowed: Unlike some other map classes, TreeMap does not allow
    // null keys. Attempting to insert a null key will result in a
    // NullPointerException.

    // Synchronized: TreeMap is not synchronized by default, but it can be made
    // synchronized by using the Collections.synchronizedSortedMap() method.

    public static void main(String[] args) {
        // Create a TreeMap that maps strings to integers
        TreeMap<String, Integer> map = new TreeMap<>();

        // Add some key-value pairs to the map
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 95);

        // Print the map
        System.out.println("Map: " + map);

        // Get the value associated with a key
        int aliceGrade = map.get("Alice");
        System.out.println("Alice's grade: " + aliceGrade);

        // Check if the map contains a key
        boolean containsBob = map.containsKey("Bob");
        System.out.println("Contains Bob? " + containsBob);

        // Remove a key-value pair from the map
        int removedGrade = map.remove("Charlie");
        System.out.println("Removed Charlie's grade: " + removedGrade);

        // Print the keys and values in the map
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (int value : map.values()) {
            System.out.println(value);
        }

        // Iterate over the key-value pairs in the map
        System.out.println("Entries:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // The program also demonstrates several other methods of the TreeMap class:

    // get(key): Retrieves the value associated with a key.
    // containsKey(key): Checks if the map contains a key.
    // remove(key): Removes a key-value pair from the map.
    // keySet(): Returns a Set containing all of the keys in the map.
    // values(): Returns a Collection containing all of the values in the map.
    // entrySet(): Returns a Set containing all of the key-value pairs in the map.

    // The program iterates over the keys, values, and entries in the map using
    // keySet(), values(), and entrySet(), respectively, and prints them to the
    // console.

}
