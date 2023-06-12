public class _02_QuickSort {

    public static int partition(int[] arr, int l, int h) {
        int i = l;

        // Pivot as the First element in an array...
        int pivot = arr[l];

        for (int j = l + 1; j <= h; j++) {
            // j :- to take care of the bigger elements than the pivot
            // i :- to take care of the smaller elements than the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap (arr[i], arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap(arr[l], arr[i])
        // to return the correct index of the pivot element..
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // 1. Divide the array into SubProblems.. using Partition
            int pi = partition(arr, low, high);

            // 2. Conquer those SubProblems via Recursion...
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6, 1, 5, 7, 9, 10, 8 };

        System.out.println("Before Sorting....");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting....");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
