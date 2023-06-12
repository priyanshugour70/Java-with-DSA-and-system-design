public class _01_MergeSort {

    // Recurrence relation for Merge Sort is: 2T(n/2) + n
    // Time Complexity: O(nlogn)
    // Space Complexity: O(n)
    // MergeSort is --> Outplace Sorting Algorithm...

    public static void mergeProcedure(int[] arr, int l, int mid, int r) {
        // Function to merge two subarrays..
        // l - lower index(i);
        // mid - middle index;
        // r - higher index(j);

        int i, j, k;

        // size of the left and right subarray..
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // create left and right subarray..
        int[] leftSubarray = new int[n1];
        int[] rightSubarray = new int[n2];

        // Copy the data into the left and right subarray..
        for (i = 0; i < n1; i++) {
            leftSubarray[i] = arr[l + i];
        }

        for (j = 0; j < n2; j++) {
            rightSubarray[j] = arr[mid + 1 + j];
        }

        // Comparision between the elements in left and right subarray..
        // and then copy the elements into the main array..
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (leftSubarray[i] <= rightSubarray[j]) {
                arr[k] = leftSubarray[i];
                i++;
            } else {
                arr[k] = rightSubarray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left subarray..
        while (i < n1) {
            arr[k] = leftSubarray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right subarray..
        while (j < n2) {
            arr[k] = rightSubarray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int i, int j) {
        if (i < j) {
            // 1. Divide the array into two subproblems..
            int mid = i + (j - i) / 2;

            // 2. Conquer the subproblems using recursion..
            // left Subarray ..
            mergeSort(arr, i, mid);
            // right Subarray ..
            mergeSort(arr, mid + 1, j);

            // 3. Combine the Solution of all Subproblems..
            mergeProcedure(arr, i, mid, j);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 7, 6 };

        int n = arr.length;

        System.out.println("Before Sorting...");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mergeSort(arr, 0, n - 1);

        System.out.println("After Sorting...");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}