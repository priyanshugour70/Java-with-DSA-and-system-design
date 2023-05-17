public class _06_Insertion_Sort {

    // Time Complexity : O(n^2)
    // Space Complexity : O(1)

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1, 6, 7, 8, 9, 8, 7, 3, 1, 6 };

        System.out.println("Before Sorted Array.. ");
        printArray(arr);
        insertionSort(arr);
        System.out.println("After Sorted Array using Bubble Sort : ");
        printArray(arr);
    }

    // For Insertion Sort Algo ...
    public static void insertionSort(int arr[]) {

        for (int i = 1; arr.length > i; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
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
