import java.util.*;
import java.util.stream.*;

public class _05_More_On_StreamAPI_wayOne {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1, 6, 7, 8, 9, 10);

        // We use Stream only ones time but the alternative solution is we create a
        // Stream and after performing operation we will create new stream and then we
        // will perform operaiton on performed stram and continue this process this is
        // the alternative option to use Stream multipul time.

        Stream<Integer> streamData = list.stream();
        // streamData.forEach(n -> System.out.println(n));

        // long countStreamData = streamData.count();
        // System.out.println(countStreamData);

        // One Way To write Methods.
        Stream<Integer> sortedStreamData = streamData.sorted();
        // sortedStreamData.forEach(n -> System.out.println(n));

        Stream<Integer> dataDoubleUsingMap = sortedStreamData.map(n -> n * 2);
        // dataDoubleUsingMap.forEach(n -> System.out.println(n));

        Stream<Integer> filterDoubleData = dataDoubleUsingMap.filter(n -> n % 2 == 0);
        filterDoubleData.forEach(n -> System.out.println(n));

        // // Second Way To witer Methods this type and the type name is method
        // // Chaining.
        // // We can write this also.
        // Stream<Integer> finalStreamData = streamData.sorted().map(n -> n *
        // 2).filter(n -> n % 2 == 0);
        // finalStreamData.forEach(n -> System.out.println(n));
    }
}
