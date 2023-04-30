import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class _07_More_On_StreamAPI_wayThird_UsingPredicate {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1, 6, 7, 8, 9, 10);

        Stream<Integer> streamData = list.stream();
        // streamData.forEach(n -> System.out.println(n));

        // In Java Stream, a predicate is a functional interface that represents a
        // boolean-valued function that takes an input element and returns true or false
        // based on a certain condition. A predicate is often used as a filtering
        // criteria in stream operations to select elements that satisfy a given
        // condition.

        // The Predicate interface in Java has a single abstract method called test()
        // which takes an input parameter of type T and returns a boolean value.

        // // This the First way to write Predicate abstract Interface using Innerclass
        // Predicate<Integer> isEven = new Predicate<Integer>() {
        // public boolean test(Integer i) {

        // if (i % 2 == 0) {
        // return true;
        // } else {
        // return false;
        // }
        // }
        // };

        // This the Second way to write Predicate abstract Interface using Lambda
        Predicate<Integer> isEven = i -> i % 2 == 0;

        Stream<Integer> finalStreamData = streamData
                .sorted()
                .map(n -> n * 2)
                .filter(isEven);
        finalStreamData.forEach(n -> System.out.println(n));
    }
}