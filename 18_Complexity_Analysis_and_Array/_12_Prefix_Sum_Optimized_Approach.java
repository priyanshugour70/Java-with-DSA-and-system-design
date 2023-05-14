import java.util.*;

public class _12_Prefix_Sum_Optimized_Approach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How Many Row in Array : ");
        int row = sc.nextInt();

        System.out.print("Enter How Many Col in Array : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        // System.out.print("Enter the value of r1 coordinate: ");
        // int r1 = sc.nextInt();

        // System.out.print("Enter the value of c1 coordinate: ");
        // int c1 = sc.nextInt();

        // System.out.print("Enter the value of r2 coordinate: ");
        // int r2 = sc.nextInt();

        // System.out.print("Enter the value of c2 coordinate: ");
        // int c2 = sc.nextInt();

        inputArray(arr);

        prefixSumMatrix(arr);

        // int optimizedPrifixSum = optimizedPrifixSum(arr, r1, c1, r2, c2);

        // System.out.println("Prifix Sum is : " + optimizedPrifixSum);

        sc.close();

        for (int i = 0; arr.length > i; i++) {
            for (int j = 0; arr[i].length > j; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // time complexity : O(m * n)
    // space complexity : O(1)
    public static void prefixSumMatrix(int[][] arr) {

        // traversed the array row-wise to calculate the row-wise prefix sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        // traversed the array column-wise to calculate the column-wise prefix sum
        // final 2D Matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[j][i] += arr[j - 1][i];
            }
        }
    }

    // For optimized Prifix Sum
    // time complexity : O(1)
    // space complexity : O(1)
    public static int optimizedPrifixSum(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = 0, up = 0, left = 0, repeated_region = 0, result = 0;

        sum = arr[r2][c2];
        up = arr[r1 - 1][c2];
        left = arr[r2][c1 - 1];
        repeated_region = arr[r1 - 1][c1 - 1];

        result = sum - up - left + repeated_region;
        return result;
    }

    // Array Input
    public static void inputArray(int arr[][]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; arr.length > i; i++) {
            for (int j = 0; arr[i].length > j; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
