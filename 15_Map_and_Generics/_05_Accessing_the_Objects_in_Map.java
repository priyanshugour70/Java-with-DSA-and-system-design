import java.util.*;
import java.util.Map.Entry;

public class _05_Accessing_the_Objects_in_Map {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(1, "Priyanshu"); // Entry
        map.put(2, "Devanshu");
        map.put(3, "Harshita");
        map.put(4, "Suhani");
        map.put(5, "Pihu");
        map.put(6, "Palak");

        // Accessing the Keys ..!
        Set keySet = map.keySet();
        Iterator itr1 = keySet.iterator();

        while (itr1.hasNext()) {
            // System.out.println(itr1.next());
            Integer key = (Integer) itr1.next();
            System.out.println(key);
        }

        // Accessing The Values..!
        Collection values = map.values();
        Iterator itr2 = values.iterator();

        while (itr2.hasNext()) {
            // System.out.println(itr2.next());
            String value = (String) itr2.next();
            System.out.println(value);
        }

        // Accessing The Both Key's and Value's
        Set keyValue = map.entrySet();
        Iterator itr3 = keyValue.iterator();

        while (itr3.hasNext()) {
            // System.out.println(itr3.next());
            Map.Entry entry = (Entry) itr3.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
