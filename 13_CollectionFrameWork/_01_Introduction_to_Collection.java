public class _01_Introduction_to_Collection {
    public static void main(String[] args) {

        // What is Collection ?

        // a collection is a group of objects, represented as a single entity, that can
        // be used to manage, store, and manipulate data. The Collections API provides a
        // set of interfaces and classes to work with collections in Java. The
        // Collection hierarchy in Java is the inheritance tree of all the interfaces
        // and classes that are part of the Collections API.

        // Collection

        // A Collection is a group of objects that can be treated as a single unit. The
        // Collection interface provides the basic functionality that all collections
        // must have, such as adding, removing, and accessing elements. The Collection
        // interface is the root of the collection hierarchy in Java.

        // Collections API:

        // The Collections API is a set of interfaces and classes that provides a
        // framework for working with collections in Java. It includes interfaces like
        // Collection, List, Set, and Map, and classes like ArrayList, HashSet, and
        // TreeMap. The Collections API provides many useful algorithms and methods to
        // work with collections, such as sorting, searching, and filtering.

        // Collection Hierarchy:

        // The Collection hierarchy in Java is a tree structure that represents the
        // inheritance relationships between the various collection interfaces and
        // classes. At the top of the hierarchy is the Collection interface, which
        // defines the basic operations that all collections must support. The List
        // interface and Set interface both extend the Collection interface, and provide
        // additional functionality for ordered and unordered collections, respectively.
        // The Map interface is not a subtype of Collection, but it is still part of the
        // Collections API and provides a way to store key-value pairs.


        // Here is the Collection hierarchy in Java:


//              Iterable (Interface)
//                 |
//                 |
//             Collection (Interface)
//         /        |     \
//        /         |      \
//      List      Queue    Set (Interface)
//       /           |            \
//      /            |             \
// ArrayList      PriorityQueue  HashSet (Class)
// LInkedList   <--Deque(Interface) LinkedHashSet (Class)
// Vector         ArrayDeque     TreeSet (Class)
// Stack   


    }
}


