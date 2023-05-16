public class _01_Linear_Search {

    // Time Complexity = O(n)
    // Time Complexity = O(1)

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 10, 9, 8, 7, 6, 5 };

        int searchingElement = 5;

        LinearSearch(arr, searchingElement);
    }

    public static void LinearSearch(int arr[], int k) {

        int val = -1;
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] == k) {
                System.out.println("Your " + k + " th Element is present on the IndexNumber : " + i);
                val = i;
                break;
            }
        }

        if (val == -1) {
            System.out.println("Your Searching Element is Not Founded ..! ");
        }
    }
}