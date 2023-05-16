public class _05_Bubble_Sort {

    // Time Complexity : O(n^2)
    // Space Complexity : O(1)

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1, 6, 7, 8, 9, 8, 7, 3, 1, 6 };

        System.out.println("Before Sorted Array.. ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After Sorted Array using Bubble Sort : ");
        printArray(arr);

    }

    // For Bubble Sort Algo ...
    public static void bubbleSort(int arr[]) {

        for (int i = 0; arr.length > i; i++) {
            for (int j = 1; arr.length - i > j; j++) {

                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

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
