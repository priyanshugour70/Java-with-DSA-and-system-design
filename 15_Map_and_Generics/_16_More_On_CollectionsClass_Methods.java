import java.util.ArrayList;
import java.util.Collections;

public class _16_More_On_CollectionsClass_Methods {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        System.out.println("Original list: " + numbers);

        // Sort the list in ascending order using the sort() method
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Find the maximum value in the list using the max() method
        int max = Collections.max(numbers);
        System.out.println("Maximum value: " + max);

        // Find the minimum value in the list using the min() method
        int min = Collections.min(numbers);
        System.out.println("Minimum value: " + min);

        // Reverse the order of the list using the reverse() method
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // Shuffle the elements in the list using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // frequency() it show how many time value in Collection.
        numbers.add(10);
        int freq = Collections.frequency(numbers, 10);
        System.out.println("Frequency of the 10 is : " + freq);
    }
}
