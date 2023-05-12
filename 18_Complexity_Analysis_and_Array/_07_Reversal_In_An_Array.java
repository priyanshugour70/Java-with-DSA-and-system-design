public class _07_Reversal_In_An_Array {

    public static void main(String[] args) {

        // Time Complexity : O(n)
        // Space Complexity : O(1)

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        int temp;
        for (int i = 0; arr.length / 2 > i; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; arr.length > i; i++) {
            System.out.println(arr[i]);
        }
    }
}