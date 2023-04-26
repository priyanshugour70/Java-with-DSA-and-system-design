import java.util.*;

public class _01_Introduction_to_Map {

    public static void main(String[] args) {


//                      +------------------+
//                      |      Map         |
//                      +------------------+
//                               ^
//                               |
//      +-----------+------------+------------+------------+          
//      |                        |                         |
// +--------------+        +---------------+        +---------------+
// |  SortedMap   |        |     HashMap   |        |   Hashtable   |
// | (Interface)  |        |     (Class)   |        |    (Class)    |
// +--------------+        +---------------+        +---------------+
//         ^                       ^
//         |                       |
// +--------------+        +---------------+
// | NavigableMap |        | LinkedHashMap |
// | (Interface)  |        |    (Class)    |
// +--------------+        +---------------+
//         ^
//         |
// +--------------+
// |    TreeMap   | 
// |    (Class)   |
// +--------------+






        // a map is a collection of key-value pairs where each key is unique and mapped
        // to a specific value. The Map interface in Java provides a variety of methods
        // for working with maps, including adding and removing key-value pairs,
        // checking if a key is present in the map, and iterating over the map's
        // contents.

        Map hashmap = new HashMap();
        Map hashtable = new Hashtable();
        Map linkedhashmap = new LinkedHashMap();
        Map treemap = new TreeMap();
    }
}
