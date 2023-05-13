import java.util.*;

// Time Complexity = O(m*n)
// Space Complexity = O(1)

public class _11_Prefix_Sum_Brute_Force_Approach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How Many Row in Array : ");
        int row = sc.nextInt();

        System.out.print("Enter How Many Col in Array : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        System.out.print("Enter the value of r1 coordinate: ");
        int r1 = sc.nextInt();

        System.out.print("Enter the value of c1 coordinate: ");
        int c1 = sc.nextInt();

        System.out.print("Enter the value of r2 coordinate: ");
        int r2 = sc.nextInt();

        System.out.print("Enter the value of c2 coordinate: ");
        int c2 = sc.nextInt();

        inputArray(arr);

        int prifixSum = prifixArray(arr, r1 - 1, r2 - 1, c1 - 1, c2 - 1);

        System.out.println("Prifix Sum is : " + prifixSum);

        sc.close();
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

    // For sum or PrifixArray..!
    public static int prifixArray(int arr[][], int row1, int row2, int col1, int col2) {

        int sum = 0;

        for (int i = row1; row2 >= i; i++) {
            for (int j = col1; col2 >= j; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}