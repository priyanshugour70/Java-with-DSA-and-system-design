import java.util.*;

public class _03_Count_of_number_of_inversions {

    // Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int countInversionBruteForce(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (curr > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Efficient Approach Using Divide and Conquer
    // Time Complexity: O(nlogn)
    // Space Complexity: O(n)
    public static int countInversionUsingDC(int arr[], int l, int r) {
        int count = 0;
        if (l < r) {
            // 1. Divide the array into two Subproblems..
            int mid = l + (r - l) / 2;

            // 2. Conquer the SubProblems using the Recursive approach..
            // left Subarray
            count += countInversionUsingDC(arr, l, mid);

            // right Subarray
            count += countInversionUsingDC(arr, mid + 1, r);

            // 3. Combine the Subproblems..
            count += mergeProcedure(arr, l, mid, r);

        }
        return count;
    }

    public static int mergeProcedure(int arr[], int l, int mid, int r) {
        // left and right Subarray..
        int[] leftSubarray = Arrays.copyOfRange(arr, l, mid + 1);
        int[] rightSubarray = Arrays.copyOfRange(arr, mid + 1, r + 1);

        int i = 0, j = 0, k = l, swap = 0;

        while (i < leftSubarray.length && j < rightSubarray.length) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                arr[k++] = leftSubarray[i++];
            } else {
                arr[k++] = rightSubarray[j++];
                // calculate the number of swaps..
                swap += (mid + 1) - (l + i);
            }
        }
        // copy all the remaining elements .. from left subarray
        while (i < leftSubarray.length) {
            arr[k++] = leftSubarray[i++];
        }

        // copy all the remaining elements .. from right subarray
        while (j < rightSubarray.length) {
            arr[k++] = rightSubarray[j++];
        }

        return swap;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = arr.length;

        int BruteForce = countInversionBruteForce(arr, n);
        int Efficient = countInversionUsingDC(arr, 0, n - 1);

        System.out.println("BruteForce: " + BruteForce);
        System.out.println("Efficient Using Divide and Conquer.. : " + Efficient);
    }
}