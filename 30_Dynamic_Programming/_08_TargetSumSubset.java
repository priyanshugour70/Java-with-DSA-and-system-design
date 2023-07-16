// Question: Given an array of non-negative integers and a value sum, determine if there is a subset of the given set with sum equal to given sum.
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

public class _08_TargetSumSubset {

    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        // i = items and j = target sum

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = arr[i - 1];

                // Include..
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                }

                // Exclude..
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        System.out.println();
        return dp[n][sum];

    }

    public static void print(boolean dp[][]) {
        for (boolean[] row : dp) {
            for (boolean val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 1, 3 };
        int sum = 10;

        System.out.println(targetSumSubset(arr, sum));
    }
}