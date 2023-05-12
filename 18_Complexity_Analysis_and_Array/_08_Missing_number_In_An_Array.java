public class _08_Missing_number_In_An_Array {
    public static void main(String[] args) {

        // Time Complexity : O(n)
        // Space Complexity : O(1)

        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

        // Sum of natural Number's
        int valueSum = (arr.length + 1) * (arr.length + 1 + 1) / 2;
        // Sum of given Number's
        int arrSum = 0;

        for (int i = 0; arr.length > i; i++) {
            arrSum += arr[i];
        }
        // Missing Number
        System.out.println("Missing Nubmer is : " + (valueSum - arrSum));

    }
}
