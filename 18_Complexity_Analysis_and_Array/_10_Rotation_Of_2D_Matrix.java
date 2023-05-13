import java.util.*;

public class _10_Rotation_Of_2D_Matrix {

    // Step 1 Input the Element's
    public static void arrayInput(int arr[][]) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    // Step 2 Transpose The Elements's
    public static void transposeMatrix(int arr[][]) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Step 3 Swap a array Element's
    public static void arraySwap(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length - 1;

            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
    }

    // Step 4 Printing the Element's
    public static void arrayPrint(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = new int[4][4];

        arrayInput(arr);
        System.out.println("Normal Martrix without Transpose.. ");
        arrayPrint(arr);
        transposeMatrix(arr);
        System.out.println("Martrix After Transpose.. ");
        arrayPrint(arr);
        arraySwap(arr);
        System.out.println("Martrix After Transpose & Swap .. ");
        arrayPrint(arr);

    }
}