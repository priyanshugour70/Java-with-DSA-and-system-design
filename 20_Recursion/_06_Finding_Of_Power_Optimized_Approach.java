import java.util.Scanner;

// Time Complexity : O(log2b)
// Space Complexity : O(n)

public class _06_Finding_Of_Power_Optimized_Approach {
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

    // To find Power of an Element using Recusion Optimize Approach
    public static int Power(int a, int b) {
        if (b <= 1) {
            return a;
        } else {
            int mid = b / 2;
            int result = Power(a, mid);
            int finalResult = result * result;

            if (b % 2 != 0) {
                return a * finalResult;
            } else {
                return finalResult;
            }
        }
    }
}
