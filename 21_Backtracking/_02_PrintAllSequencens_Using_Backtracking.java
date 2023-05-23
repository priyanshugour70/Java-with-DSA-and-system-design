import java.util.ArrayList;
import java.util.Arrays;

public class _02_PrintAllSequencens_Using_Backtracking {
    public static void printSequences(int[] arr, int index, ArrayList<Integer> tempArr) {
        // base case
        if (index == arr.length) {
            // print all the sequences -- but do not print empty entries
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }

        // recursive call

        // include
        printSequences(arr, index + 1, tempArr);

        // add the value in the tempArray
        tempArr.add(arr[index]);

        // do not include
        printSequences(arr, index + 1, tempArr);

        // remove the value from tempArray -- backtracking
        tempArr.remove(tempArr.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2 };

        System.out.println("For the array - " + Arrays.toString(arr1));

        printSequences(arr1, 0, new ArrayList<Integer>());

        System.out.println();

        int[] arr2 = { 1, 2, 3 };

        System.out.println("For the array - " + Arrays.toString(arr2));

        printSequences(arr2, 0, new ArrayList<Integer>());
    }
}