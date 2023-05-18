import java.util.Scanner;

// Time Complexity : O(n)
// Space Complexity : O(n)

public class _03_factorial_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Find Fact : ");
        int n = sc.nextInt();

        int fact = Fact(n);

        System.out.println("Fact of Number is : " + fact);

        sc.close();
    }

    // Recursive Code to find Factorial ..
    public static int Fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Fact(n - 1);
        }
    }
}
