import java.util.*;
import java.util.stream.*;

public class _06_More_On_StreamAPI_wayTwo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1, 6, 7, 8, 9, 10);

        Stream<Integer> streamData = list.stream();
        // streamData.forEach(n -> System.out.println(n));

        // Second Way To witer using method Chaining.
        Stream<Integer> finalStreamData = streamData
                .sorted()
                .map(n -> n * 2)
                .filter(n -> n % 2 == 0);
        finalStreamData.forEach(n -> System.out.println(n));
    }
}
