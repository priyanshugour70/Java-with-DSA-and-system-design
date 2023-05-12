public class _06_Palindrome_Array {

    public static void main(String[] args) {

        // Time Complexity : O(n)
        // Space Complexity : O(1)

        int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

        for (int i = 0; arr.length / 2 > i; i++) {

            if (arr[i] != arr[arr.length - 1 - i]) {
                System.out.println("Array in Not Palindrome");
                break;
            }
        }
    }
}