public class _07_Selection_Sort {
    // Time Complexity : O(n^2)
    // Space Complexity : O(1)

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1, 6, 7, 8, 9, 8, 7, 3, 1, 6 };

        System.out.println("Before Sorted Array.. ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("After Sorted Array using Selection Sort : ");
        printArray(arr);
    }

    // For Selection Sort Algo ...
    public static void selectionSort(int arr[]) {
        for (int i = 0; arr.length - 1 > i; i++) {
            int minPos = i;

            for (int j = i + 1; arr.length > j; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    // For printing Array ...
    public static void printArray(int arr[]) {
        for (int i = 0; arr.length > i; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
