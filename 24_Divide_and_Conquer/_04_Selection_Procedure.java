public class _04_Selection_Procedure {

    // Tiem Complexity: O(n)
    // Space Complexity: O(1)

    // function to do the partition of an array
    public static int partition(int[] arr, int l, int h) {
        // first element as the pivot element in an array
        int pivot = arr[l];
        int i = l;
        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                // swap(arr[i], arr[j])
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        // swap (arr[l], arr[i])
        // to get the correct position of the pivot element
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;
        // index of the pivot element
        return i;
    }

    public static int selectionProcedure(int[] arr, int l, int h, int k) {
        // 1. Dividing the problem into subproblems
        int m = partition(arr, l, h);
        // relationship between the index number and the position number
        if (m == k - 1) {
            return arr[m];
        }

        else if (m < k - 1) {
            // traverse towards right side of an array
            // 2. Conquer the subproblems via recursion
            return selectionProcedure(arr, m + 1, h, k);
        }
        // traverse towards left side of an array
        else {
            return selectionProcedure(arr, l, m - 1, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 50, 30, 70, 90, 10, 34, 89, 98, 13 };
        int n = arr.length;
        int k = 1;

        int result = selectionProcedure(arr, 0, n - 1, k);
        System.out.println("The kth smallest element in an array is: " + result);

    }
}
