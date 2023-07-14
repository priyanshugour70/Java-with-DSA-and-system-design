// in this program we are going to find the nth fibonacci number using dynamic programming(Memorization).
// Time Complexity: O(n)
// Space Complexity: O(n)

public class _01_FibonacciUsingDP_Memorization {

    public static int fibonacci(int n, int fib[]) {
        if ((n == 0) || (n == 1)) {
            return n;
        }

        if (fib[n] != 0) {
            return fib[n];
        }

        int ans = fibonacci(n - 1, fib) + fibonacci(n - 2, fib);
        fib[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int fib[] = new int[n + 1];

        System.out.println(fibonacci(n, fib));
    }
}