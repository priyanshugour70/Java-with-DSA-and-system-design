import java.util.Scanner;

public class _09_Binary_Search_Using_Recursion {

    // Time Complexity : O()
    // Space Complexity : O()

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of The Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        arrayInput(arr, sc);

        System.out.print("Enter Number to Search in Array : ");
        int target = sc.nextInt();

        int searchedElement = binarySearch(arr, 0, arr.length, target);

        if (searchedElement == -1) {
            System.out.println("Element is not in the Array");
        } else {
            System.out.println("Searched Element present At Index number : " + searchedElement);
        }

        sc.close();

    }

    // For Searching The Element...
    public static int binarySearch(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, right, target);
            } else {
                return binarySearch(arr, left, right - 1, target);
            }
        }

        return -1;
    }

    // For Input Array ...
    public static void arrayInput(int arr[], Scanner sc) {

        for (int i = 0; arr.length > i; i++) {
            System.out.print("Enter Index value " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

}