import java.util.*;

public class _02_HashMap {
    public static void main(String[] args) {

        // A HashMap is a data structure in Java that stores data in key-value pairs,
        // where each key is unique and associated with a value. The HashMap class is
        // part of the Java Collections Framework and is useful when we want to retrieve
        // data based on its key rather than its position.

        // Properties of HashMap:

        // Keys are unique: Every key in a HashMap is unique. Duplicate keys are not
        // allowed in the map.

        // Null values: HashMap can have one null key and multiple null values.

        // Unordered: HashMap does not maintain any order between the keys or values.
        // The order of keys or values may change over time.

        // Iteration: HashMap can be iterated using the iterator, foreach loop or using
        // streams.

        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Dave", 40);

        // Printing the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // Printing the contents of the HashMap
        System.out.println("Contents of the HashMap: " + map);

        // Checking if a key exists in the HashMap
        if (map.containsKey("Alice")) {
            System.out.println("Alice's age is " + map.get("Alice"));
        }

        // Checking if a value exists in the HashMap
        if (map.containsValue(30)) {
            System.out.println("Bob is in the HashMap.");
        }

        // Removing an element from the HashMap
        map.remove("Charlie");
        System.out.println("Charlie has been removed from the HashMap.");

        // Iterating over the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " is " + map.get(key) + " years old.");
        }

        // Clearing the HashMap
        map.clear();
        System.out.println("HashMap has been cleared. Size of the HashMap: " + map.size());
    }
}
