import java.util.Scanner;

// Time Complexity : O(log(m*n))
// Space Complexity : O(1)

public class _11_Search_A_2D_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row's of The Matrix : ");
        int row = sc.nextInt();
        System.out.print("Enter The Column's Of The Matrix : ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        input2DArray(matrix, sc);

        System.out.print("Enter The Element to Search in Array : ");
        int target = sc.nextInt();

        if (searchMatrix(matrix, target)) {
            System.out.println("Element is present in the Matrix.. ");
        }
        sc.close();
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        // Number of rows
        int m = matrix.length;
        if (m == 0) {
            return false;
        }

        // Number of Colums
        int n = matrix[0].length;

        // Binary Search Implementation..
        int left = 0, right = m * n - 1;
        int midIdx, midElement, rowIdx, colIdx;

        while (left <= right) {
            midIdx = left + (right - left) / 2;

            rowIdx = midIdx / n;
            colIdx = midIdx % n;

            midElement = matrix[rowIdx][colIdx];

            if (midElement == target) {
                return true;
            } else {
                if (midElement > target) {
                    right = midIdx - 1;
                } else {
                    left = midIdx + 1;
                }
            }
        }

        return false;
    }

    // For 2D Array Input ..
    public static void input2DArray(int arr[][], Scanner sc) {
        for (int i = 0; arr.length > i; i++) {
            for (int j = 0; arr[i].length > j; j++) {
                System.out.print("Enter the [" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
}