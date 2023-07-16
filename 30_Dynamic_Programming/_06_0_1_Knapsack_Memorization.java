public class _06_0_1_Knapsack_Memorization {

    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            // we have two choices either we can take the item or we can leave the item
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            // we are not taking the item
            int ans2 = knapsack(val, wt, W, n - 1, dp);
            return dp[n][W] = Math.max(ans1, ans2);
        } else {
            // we are not taking the item
            return dp[n][W] = knapsack(val, wt, W, n - 1, dp);
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, W, val.length, dp));
    }
}
