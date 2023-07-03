public class _01_Heapify {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int leftChild = 2 * i + 1; // Left child index
        int rightChild = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // If right child is larger than current largest
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If largest is not the root
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 15, 10, 20, 25, 5, 30 };

        int n = arr.length;

        System.out.println("Before heapify, array elements are:");
        printArray(arr, n);

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.println("After heapify, array elements are:");
        printArray(arr, n);
    }
}
