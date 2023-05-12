public class _09_Duplicate_Elements_Finding {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8, 9 };

        for (int i = 0; arr.length > i; i++) {
            for (int j = i + 1; arr.length > j; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is Duplicate Number. ");
                }
            }
        }
    }
}
