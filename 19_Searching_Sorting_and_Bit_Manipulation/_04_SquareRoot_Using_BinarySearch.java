import java.util.*;

// Time Complexity : O(logN)
// Space Complexity : O(1)

public class _04_SquareRoot_Using_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number to find Square Root : ");
        int num = sc.nextInt();

        int sr = squareRoot(num);

        System.out.println("Square Root of the Number is : " + sr);

        sc.close();
    }

    public static int squareRoot(int n) {

        int left = 0, right = n - 1, result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (mid * mid == n) {
                result = mid;
                return result;
            } else if (mid * mid > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
                result = mid;
            }
        }

        return result;
    }
}
