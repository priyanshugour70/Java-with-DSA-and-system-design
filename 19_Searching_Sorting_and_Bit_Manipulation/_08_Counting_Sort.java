public class _08_Counting_Sort {
    // Time Complexity : O(K + N)
    // Space Complexity : O(K + N)

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1, 6, 7, 8, 9, 8, 7, 3, 1, 6 };

        System.out.println("Before Sorted Array.. ");
        printArray(arr);
        countSort(arr);
        System.out.println("After Sorted Array using Counting Sort : ");
        printArray(arr);
    }

    // For Counting Sort Algo ...
    public static void countSort(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; arr.length > i; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int Auxiliary[] = new int[largest + 1];

        for (int i = 0; arr.length > i; i++) {
            Auxiliary[arr[i]]++;
        }

        // Sorting ...
        int j = 0;
        for (int i = 0; Auxiliary.length > i; i++) {
            while (Auxiliary[i] > 0) {
                arr[j] = i;
                j++;
                Auxiliary[i]--;
            }
        }
    }

    // For printing Array ...
    public static void printArray(int arr[]) {
        for (int i = 0; arr.length > i; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
