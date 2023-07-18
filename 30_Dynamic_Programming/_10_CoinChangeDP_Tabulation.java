// In this problem we have to find the minimum number of coins required to make the given amount.
// Time Complexity: O(n*m) where n is the number of coins and m is the amount
// Space Complexity: O(n*m) where n is the number of coins and m is the amount

public class _10_CoinChangeDP_Tabulation {

    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];

        // initialization - sum is 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // initialization - coins is 0
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }

        // choice diagram
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // return the last element of the matrix
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 3 };
        int sum = 4;

        System.out.println(coinChange(coins, sum));
    }
}