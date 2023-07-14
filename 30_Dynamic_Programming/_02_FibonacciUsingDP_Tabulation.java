// In this program, we will find the nth Fibonacci number using Dynamic Programming and Tabulation method.
// Time Complexity: O(n)
// Space Complexity: O(n)

public class _02_FibonacciUsingDP_Tabulation {
    public static void main(String[] args) {
        int n = 10;
        int fib[] = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(fib[n]);
    }
}
