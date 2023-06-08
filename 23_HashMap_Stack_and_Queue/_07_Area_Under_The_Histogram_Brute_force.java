import java.util.Scanner;

public class _07_Area_Under_The_Histogram_Brute_force {

    // Mehod for find the maximum area under the histogram..
    public static int maxHistogramArea(int arr[]) {
        int maxArea = 0;

        int prevSmaller[] = new int[arr.length];
        int nextSmaller[] = new int[arr.length];

        // Finding the previous smaller element index..
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] >= arr[i]) {
                j--;
            }
            prevSmaller[i] = j;
        }

        // Finding the next smaller element index..
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = i + 1;
            while (j < arr.length && arr[j] >= arr[i]) {
                j++;
            }
            nextSmaller[i] = j;
        }

        // Finding the maximum area under the histogram..
        for (int i = 0; i < arr.length; i++) {
            int area = arr[i] * (nextSmaller[i] - prevSmaller[i] - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the Array : ");
        int arr[] = new int[n];
        for (int i = 0; n > i; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The maximum area under the histogram is : " + maxHistogramArea(arr));

        sc.close();
    }
}
