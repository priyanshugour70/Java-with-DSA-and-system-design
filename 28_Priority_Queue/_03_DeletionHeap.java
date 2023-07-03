public class _03_DeletionHeap {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // check if the left child is greater than the largest
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // check if the right child is greater than the largest
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // if largest is not root
        if (largest != i) {
            swap(arr, i, largest);

            heapify(arr, n, largest);
        }
    }

    public static int delete(int[] arr, int n) {
        // get the last node
        int lastNode = arr[n - 1];

        // replace it with the first element
        arr[0] = lastNode;

        // decrease the size of the heap
        n--;

        heapify(arr, n, 0);

        return n;
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int MAX = 100;

        int[] arr = new int[MAX];

        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;

        System.out.println("Before delete, heap elements are : ");
        printArray(arr, n);

        n = delete(arr, n);

        System.out.println("After delete, heap elements are : ");
        printArray(arr, n);
    }
}