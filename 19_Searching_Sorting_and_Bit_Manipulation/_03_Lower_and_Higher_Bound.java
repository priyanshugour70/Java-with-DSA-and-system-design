import java.util.Scanner;

public class _03_Lower_and_Higher_Bound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 6, 7, 8, 9, 10 };

        System.out.print("Enter The Element to find Lower and Higher bound : ");
        int key = sc.nextInt();

        int lb = lowerBound(arr, key);
        int hb = higherBound(arr, key);

        if (lb == -1 & hb == -1) {
            System.out.println("Value was not present in the Array... ");
        } else {
            System.out.println("Lower bound is " + lb);
            System.out.println("Higher bound is " + hb);
        }
        sc.close();
    }

    public static int lowerBound(int arr[], int key) {
        int left = 0, right = arr.length - 1;
        int temp = -1;

        while (right >= left) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                temp = mid;
                right = mid - 1;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return temp;
    }

    public static int higherBound(int arr[], int key) {
        int left = 0, right = arr.length - 1;
        int temp = -1;

        while (right >= left) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                temp = mid;
                left = mid + 1;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return temp;
    }
}
