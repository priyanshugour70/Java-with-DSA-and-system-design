// in this problem we have to find the maximum profit that we can get from the given items 
// we have to take the items in such a way that the total weight of the items is less than or equal to the given weight

// Time Complexity: O(2^n)
// Space Complexity: O(1)

public class _05_0_1_Knapsack_Recursion {

    public static int knapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            // we have two choices either we can take the item or we can leave the item
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // we are not taking the item
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            // we are not taking the item
            return knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int n = val.length;

        System.out.println(knapsack(val, wt, W, n));

    }
}
