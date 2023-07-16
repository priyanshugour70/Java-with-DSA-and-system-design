// In this problem, we are given a set of items, each with a weight and a value, and we need to determine the number of each item to include in a collection so that the total weight is less than or equal to a given limit and the total value is as large as possible.
// using tabulation method

// Time Complexity: O(n*W), where ‘n’ represents the total number of items and ‘W’ is the maximum weight capacity of the knapsack.
// Space Complexity: O(n*W), where ‘n’ represents the total number of items and ‘W’ is the maximum weight capacity of the knapsack.

public class _07_0_1_Knapsack_Tabulation {

    public static int knapsackTabulation(int val[], int wt[], int W) {
        int dp[][] = new int[val.length + 1][W + 1];
        int n = val.length;
        for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1]; // ith item val
                int w = wt[i - 1]; // ith item wt
                if (w <= j) {
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        printArr(dp);
        return dp[n][W];
    }

    public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(String.format("%-3d", arr[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        System.out.println(knapsackTabulation(val, wt, W));
    }
}
