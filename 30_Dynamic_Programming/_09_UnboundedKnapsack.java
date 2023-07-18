// in fractional knapsack we can take fraction of an item but in 0/1 knapsack we can't take fraction of an item

// In this quection unbounded kanpsack in this we can take fraction of an item and we can take multiple times of an item
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

public class _09_UnboundedKnapsack {

    public static int unboundedKnapsack(int val[], int wt[], int W, int n) {
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i - 1] <= j) {
                    // This is for Unbounded knapsack
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);

                    // This is for 0/1 knapsack
                    // dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        System.out.println(unboundedKnapsack(val, wt, W, val.length));
    }
}

// Output: 100