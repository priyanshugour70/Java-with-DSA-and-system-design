import java.util.stream.*;
import java.util.*;

public class _04_Introduction_To_Stream_API {
    public static void main(String[] args) {

        // The Stream API in Java is a powerful tool for processing collections of data
        // in a concise and efficient way. It was introduced in Java 8 and has since
        // become an essential part of the language. The Stream API provides a set of
        // high-level abstractions for processing data that can be executed in parallel
        // or sequentially.

        // We use the Stream API in Java when we need to process collections of data,
        // such as lists, arrays, or maps. It is especially useful when we need to
        // perform complex operations on the data, such as filtering, mapping, or
        // reducing.

        // The main advantage of the Stream API is that it allows us to write more
        // concise and expressive code. Instead of using loops or other imperative
        // constructs, we can use functional programming techniques to process the data.
        // This makes the code more readable, maintainable, and testable.

        // The Stream API has several properties that make it a powerful tool for
        // processing data:

        // Laziness: The operations on a stream are executed only when necessary. This
        // means that we can perform complex operations on large datasets without having
        // to load all the data into memory at once.

        // Parallelism: The Stream API supports parallel processing, which means that we
        // can take advantage of multiple cores on modern CPUs to speed up our
        // computations.

        // Immutability: Streams are immutable, which means that the original data is
        // not modified. This makes it easier to reason about the behavior of the code
        // and reduces the risk of bugs.

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> streamlist = list.stream();

        streamlist.forEach(n -> System.out.println(n));

        // streamlist.forEach(n-> System.out.println(n)); // we can only one time Stream
        // because its property types is Comsuming

    }
}
