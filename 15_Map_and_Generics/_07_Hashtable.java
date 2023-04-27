import java.util.Hashtable;

public class _07_Hashtable {
    public static void main(String[] args) {

        // a Hashtable is a data structure that implements the Map interface. It is used
        // to store key-value pairs and allows quick access to the value associated with
        // a given key. Here are some properties of the Hashtable class:

        // Thread-safe: Hashtable is synchronized, meaning that multiple threads can
        // access it concurrently without causing data corruption or other issues.
        // However, this can lead to performance issues in heavily multithreaded
        // applications.

        // Unordered: The elements in a Hashtable are not guaranteed to be in any
        // particular order. If you need to maintain a specific order, you should use a
        // LinkedHashMap instead.

        // No null keys or values: Hashtable does not allow null keys or values. If you
        // try to insert a null key or value, a NullPointerException will be thrown.

        // Creating a new Hashtable with String keys and Integer values
        Hashtable<String, Integer> grades = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Charlie", 95);

        // Displaying the Hashtable
        System.out.println("Initial Hashtable: " + grades);

        // putIfAbsent("Bob", 85); : in this method data was not present in Map then add
        // if already exist then data was not add.
        grades.putIfAbsent("Bob", 85);
        System.out.println("After this : putIfAbsent('Bob', 85) : " + grades);

        // Retrieving the value associated with a key
        int bobGrade = grades.get("Bob");
        System.out.println("Bob's grade: " + bobGrade);

        // Removing a key-value pair from the Hashtable
        grades.remove("Charlie");
        System.out.println("Hashtable after removing Charlie: " + grades);

        // Checking if a key exists in the Hashtable
        boolean aliceExists = grades.containsKey("Alice");
        System.out.println("Does Alice exist? " + aliceExists);

        // Checking if a value exists in the Hashtable
        boolean ninetyExists = grades.containsValue(90);
        System.out.println("Does 90 exist? " + ninetyExists);

        // Getting the number of key-value pairs in the Hashtable
        int size = grades.size();
        System.out.println("Size of Hashtable: " + size);

        // Clearing the Hashtable
        grades.clear();
        System.out.println("Hashtable after clearing: " + grades);
    }
}
