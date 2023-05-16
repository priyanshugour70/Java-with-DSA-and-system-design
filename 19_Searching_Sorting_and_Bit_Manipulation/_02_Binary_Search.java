public class _02_Binary_Search {

    // Time Complexity = O(log2N) or O(logN)
    // Time Complexity = O(i)

    public static int Binary_Search(int arr[], int key) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
        int key = 19;
        int searched = Binary_Search(arr, key);

        System.out.println(searched);
    }
}
