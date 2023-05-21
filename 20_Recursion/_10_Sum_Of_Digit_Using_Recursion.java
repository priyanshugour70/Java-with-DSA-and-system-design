import java.util.Scanner;

// Time Complexity : O()
// Space Complexity : O()

public class _10_Sum_Of_Digit_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Digit to find Sum : ");
        int digit = sc.nextInt();

        int sumOfDigit = sumDigit(digit);

        System.out.println("Sum of The Digit is : " + sumOfDigit);

        sc.close();
    }

    // To Find Sum of digit ...
    public static int sumDigit(int digit) {
        if (0 >= digit) {
            return 0;
        } else {
            return ((digit % 10) + sumDigit(digit / 10));
        }
    }
}
