import java.util.Scanner;

public class _02_Sum_Of_N_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Find Sum : ");
        int n = sc.nextInt();

        int sum = Sum(n);

        System.out.println("Sum of N Number's is : " + sum);

        sc.close();
    }

    // Recursive code to find Sum of N number ...
    public static int Sum(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + Sum(n - 1);
        }
    }
}