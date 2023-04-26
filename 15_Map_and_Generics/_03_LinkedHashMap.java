import java.util.*;;

public class _03_LinkedHashMap {
    public static void main(String[] args) {

        // LinkedHashMap is a class in Java's collection framework that extends HashMap
        // and maintains a doubly linked list of the entries in the map in the order
        // they were inserted. In other words, it maintains the order in which the
        // entries were added to the map, which means that the order of iteration over
        // the keys or values of the map is guaranteed to be the same as the order of
        // insertion.

        // Some properties of LinkedHashMap are:

        // It has the same performance characteristics as HashMap for basic operations
        // like put, get and remove.
        // It provides a predictable iteration order, which can be either in the order
        // of insertion or in the order of last access.
        // It can be used as a cache, where the least recently used entries can be
        // evicted from the map automatically.

        // Creating a new LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Adding key-value pairs to the map
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);
        map.put("Charlie", 40);

        // Printing the map
        System.out.println("Original Map: " + map);

        // Accessing the value associated with a particular key
        int age = map.get("Bob");
        System.out.println("Bob's age is " + age);

        // Removing a key-value pair
        map.remove("Alice");
        System.out.println("After removing Alice: " + map);

        // Iterating over the map using a for-each loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " is " + value + " years old.");
        }

        // Replacing the value associated with a particular key
        map.replace("Charlie", 45);
        System.out.println("After replacing Charlie: " + map);

        // Clearing the map
        map.clear();
        System.out.println("After clearing the map: " + map);
    }
}
