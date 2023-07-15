// Climbing Stairs :- Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.
// Time Complexity: O(n)
// Space Complexity: O(n)

public class _03_ClimbingStairs_DP_Memorization {

    public static int climbingStairs(int n, int[] dp) {
        if (n < 0 || n == 0) {
            return n == 0 ? 1 : 0;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = climbingStairs(n - 1, dp) + climbingStairs(n - 2, dp);
        dp[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(climbingStairs(n, dp));
    }
}