// in this Climbing Stairs Variation problem:- Count ways to reach the nth stair. The person can climb either 1 stair, 2 stairs and 3 stairs at a time.
// Time Complexity: O(n)
// Space Complexity: O(n)

public class _04_ClimbingStairsVariation_DP_Tabulation {

    public static int climbingStairTabulation(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = 1;
            } else if (i == 2) {
                dp[i] = 2;
            } else if (i == 3) {
                dp[i] = 4;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(climbingStairTabulation(n));
    }
}
