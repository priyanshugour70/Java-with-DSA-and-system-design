import java.util.*;

public class _05_Finding_Of_Power_Using_Recursion {
    // Time Complexity : O(2^n)
    // Space Complexity : O(n)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Find Power : ");
        int a = sc.nextInt();

        System.out.print("Enter the Power of Number : ");
        int b = sc.nextInt();

        int pw = Power(a, b);

        System.out.println("Power is : " + pw);

        sc.close();
    }

    // to find Power using Recursion ..
    public static int Power(int a, int b) {
        if (b <= 1) {
            return a;
        } else {
            return a * Power(a, b - 1);
        }
    }
}