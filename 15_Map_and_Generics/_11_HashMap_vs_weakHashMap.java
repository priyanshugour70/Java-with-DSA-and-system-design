import java.util.HashMap;
import java.util.WeakHashMap;

public class _11_HashMap_vs_weakHashMap {

    // Both HashMap and WeakHashMap are data structures in Java that implement the
    // Map interface, which allows you to store and retrieve key-value pairs.
    // However, there are some key differences between the two.

    // A HashMap stores a key-value pair in a hash table. When you add an element to
    // a HashMap, it calculates the hash code of the key and uses it to determine
    // the index at which the value should be stored in the hash table. If there is
    // already an element at that index, the HashMap uses a linked list to store
    // multiple elements at the same index. HashMaps are useful when you need to
    // quickly retrieve elements based on their keys.

    // A WeakHashMap is a variation of the HashMap that allows the garbage collector
    // to remove entries when the only reference to the key is from the WeakHashMap.
    // In a WeakHashMap, the keys are stored as weak references, which means that
    // they do not prevent the key from being garbage collected when there are no
    // other references to it. This is useful when you need to associate values with
    // objects that may be garbage collected, and you want the values to be
    // automatically removed when the keys are no longer in use.

    public static void main(String[] args) {
        // Create a strong reference to an object
        Object key = new Object();

        // Create a HashMap and add the object as a key-value pair
        HashMap<Object, String> hashMap = new HashMap<>();
        hashMap.put(key, "value");

        // Create a WeakHashMap and add the object as a key-value pair
        WeakHashMap<Object, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(key, "value");

        // Remove the strong reference to the object
        key = null;

        // Force garbage collection
        System.gc();

        // The HashMap still contains the key-value pair
        System.out.println(hashMap.size()); // Output: 1

        // The WeakHashMap no longer contains the key-value pair
        System.out.println(weakHashMap.size()); // Output: 0
    }

    // In this example, we create an object key and add it as a key-value pair to
    // both a HashMap and a WeakHashMap. We then remove the strong reference to the
    // object by setting key to null and force garbage collection. When we check the
    // sizes of the HashMap and WeakHashMap, we see that the HashMap still contains
    // the key-value pair, while the WeakHashMap no longer does.

    // This is because the HashMap holds a strong reference to the key, so even
    // though there are no other references to the key, it is not garbage collected.
    // The WeakHashMap, on the other hand, holds a weak reference to the key, which
    // means that the key can be garbage collected when there are no other
    // references to it. When the key is garbage collected, the entry in the
    // WeakHashMap is automatically removed.
}
