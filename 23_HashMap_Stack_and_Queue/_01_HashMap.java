import java.util.HashMap;
import java.util.Map;

public class _01_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();

        // Functinonality of the put() method..
        hashmap.put(1, "Priyanshu Gour");
        hashmap.put(2, "Devanshu Gour");
        hashmap.put(3, "Suhani Gour");
        hashmap.put(4, "Harshit Gour");

        System.out.println(hashmap);

        // Functionality of the get() method..
        String name = hashmap.get(1);
        System.out.println(name);
        String name2 = hashmap.get(2);
        System.out.println(name2);

        // Functionality of the containsKey() method..
        System.out.println(hashmap.containsKey(1));

        // Functionality of the remove() method..
        hashmap.remove(4);
        System.out.println(hashmap);

        // Functionality of the size() method..
        System.out.println(hashmap.size());

        // Functionality of the replace() method..
        hashmap.replace(3, "Suhani Gour", "Suhani");
        System.out.println(hashmap);

        // Iterating using the for loop..
        for (Map.Entry<Integer, String> e : hashmap.entrySet()) {
            System.out.println("HashMap is : " + e.getKey() + " : " + e.getValue());
        }
    }
}