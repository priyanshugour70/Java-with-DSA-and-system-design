import java.math.BigInteger;
import java.util.Scanner;

// Time Complexity : O(log2b)
// Space Complexity : O(n)

public class _07_Finding_Of_Power_Using_BigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Find Power : ");
        BigInteger a = sc.nextBigInteger();

        System.out.print("Enter the Power of Number : ");
        int b = sc.nextInt();

        BigInteger pw = Power(a, b);

        System.out.println("Power is : " + pw);

        sc.close();
    }

    // To find Power of an Element using Recusion Optimize Approach
    public static BigInteger Power(BigInteger a, int b) {
        if (b <= 1) {
            return a;
        } else {
            BigInteger result = Power(a, b / 2);
            BigInteger finalResult = result.multiply(result);

            if (b % 2 != 0) {
                return a.multiply(finalResult);
            } else {
                return finalResult;
            }
        }
    }
}
