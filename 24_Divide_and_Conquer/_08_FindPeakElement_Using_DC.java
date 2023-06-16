public class _08_FindPeakElement_Using_DC {

    public static int findPeak(int arr[], int low , int high , int n){
        int m = low + (high - low)/2;

        if((m == 0 || arr[m-1] <= arr[m]) && (m == n-1 || arr[m+1] <= arr[m])){
            return m;
        }
        else if(m > 0 && arr[m-1] > arr[m]){
            return findPeak(arr, low, m-1, n);
        }
        else{
            return findPeak(arr, m+1, high, n);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,2,4,6,3,2};

        int peak = findPeak(arr, 0, arr.length-1, arr.length);

        System.out.println("Peak Element Index is : " + peak);
    }
}
