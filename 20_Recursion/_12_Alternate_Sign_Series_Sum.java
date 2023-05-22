import java.util.Scanner;

public class _12_Alternate_Sign_Series_Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to Find Alternate Series Sum : ");
        int ass = sc.nextInt();

        int sum = alternateSign(ass);

        System.out.println("Alternate Sign Series Sum is (-1,+2,-3,+4,-5,.... ) : " + sum);

        sc.close();
    }

    // To Find Alternate Sign Series Sum using Recursion..
    public static int alternateSign(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return alternateSign(n - 1) - n;
            } else {
                return alternateSign(n - 1) + n;
            }
        }
    }
}
