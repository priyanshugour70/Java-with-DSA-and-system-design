import java.util.*;

// Time Complexity : O(2^n)
// Space Complexity : O(n)

public class _04_Fibonacci_Using_Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Find Fibonacci : ");
        int n = sc.nextInt();

        int fibo = Fibonacci(n);

        System.out.println("Fibonacci of Number is : " + fibo);

        sc.close();
    }

    // Recursive Code to find Fibonacci ..
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}