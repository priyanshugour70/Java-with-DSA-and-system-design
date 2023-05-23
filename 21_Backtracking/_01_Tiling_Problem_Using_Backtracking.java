import java.util.Scanner;

// Time Complexity : O()
// Space Complexity : O()

public class _01_Tiling_Problem_Using_Backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size of CartBoard : ");
        int n = sc.nextInt();

        int tilingways = tilingGatways(n);

        System.out.println("tiling Ways in This CartBoard : " + tilingways);

        sc.close();

    }

    public static int tilingGatways(int n) {
        // Base Case..
        if (n <= 3) {
            return n;
        } else {
            return tilingGatways(n - 1) + tilingGatways(n - 2);
        }
    }
}