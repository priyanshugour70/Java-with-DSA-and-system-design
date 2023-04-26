import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _04_HashMap_vs_LinkedHashMap {
    public static void main(String[] args) {
        // HashMap and LinkedHashMap are two classes in Java's collection framework that
        // are used to store key-value pairs. Here are some differences between the two:

        // Ordering: LinkedHashMap maintains the order of insertion while HashMap
        // doesn't guarantee any order.

        // Performance: HashMap has a slightly better performance for basic operations
        // like put, get and remove as it doesn't have to maintain the order.

        // Iteration: LinkedHashMap provides a predictable iteration order, which can be
        // either in the order of insertion or in the order of last access. HashMap
        // doesn't guarantee any order during iteration.

        // Memory consumption: LinkedHashMap consumes slightly more memory than HashMap
        // as it maintains the order of insertion using a doubly linked list.

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);

        linkedHashMap.put("apple", 1);
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("orange", 3);

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        hashMap.put("apple", 4);
        linkedHashMap.put("apple", 4);

        System.out.println("HashMap after update: " + hashMap);
        System.out.println("LinkedHashMap after update: " + linkedHashMap);

        hashMap.remove("banana");
        linkedHashMap.remove("banana");

        System.out.println("HashMap after remove: " + hashMap);
        System.out.println("LinkedHashMap after remove: " + linkedHashMap);

        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
        // Output:
        // apple: 4
        // orange: 3

        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }
        // Output:
        // apple: 4
        // banana: 2
        // orange: 3
    }
}
