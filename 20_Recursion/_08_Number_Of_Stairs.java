import java.util.*;

// Time Complexity : O(2^n)
// Space Complexity : O(n)

public class _08_Number_Of_Stairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Find StairCase : ");
        int n = sc.nextInt();

        int stair = countStairs(n);

        System.out.println("Number of Stair Types is : " + stair);

        sc.close();
    }

    // Recursive Code to find Count Stairs ..
    public static int countStairs(int n) {
        if (n <= 1) {
            return n;
        } else {
            return countStairs(n - 1) + countStairs(n - 2);
        }
    }
}
