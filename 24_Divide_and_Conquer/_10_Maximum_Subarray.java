import java.util.*;

public class _10_Maximum_Subarray {

    public static int maxSubArray(int[] nums , int low, int high) {
        // Invalid Range : low is greater than high.. 
        if( low > high ){
            return Integer.MIN_VALUE;
        }
        // Base Caser : Only one element in the array
        if( low == high ){
            return nums[low];
        }

        // Find middle point 
        int middle = (low + high) / 2;

        return Math.max(
            Math.max(maxSubArray(nums, low, middle-1), maxSubArray(nums, middle+1, high)),
            maxCrossingSum(nums, low, middle, high));
    }

    public static int maxCrossingSum(int arr[], int low , int middle, int high){
        // Include elements on left of mid.
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for(int i=middle; i>=low; i--){
            sum = sum + arr[i];
            if(sum > left_sum){
                left_sum = sum;
            }
        }

        // Include elements on right of mid.
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for(int i=middle+1; i<=high; i++){
            sum = sum + arr[i];
            if(sum > right_sum){
                right_sum = sum;
            }
        }

        return Math.max(left_sum + right_sum - arr[middle], Math.max(left_sum, right_sum));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = maxSubArray(arr, 0 , n-1);

        System.out.println("The maximum sum of subarray is: " + result);
        
        
        sc.close();
    }
}
