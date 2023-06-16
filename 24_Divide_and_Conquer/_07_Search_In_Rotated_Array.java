public class _07_Search_In_Rotated_Array {

    public static int search (int []arr, int l, int h , int key ){
        int pivot = findPivot(arr, l, h);

        if(arr[pivot] == -1){
            return binarySearch(arr, l, h , key);
        }
        if(arr[pivot] == key){
            return pivot;
        }
        if(key >= arr[l]){
            return binarySearch(arr, l, pivot-1, key);
        }else{
            return binarySearch(arr, pivot+1, h , key);
        }
    }

    public static int findPivot(int arr[], int low, int high){
        if(high < low){
            return -1;
        }
        
        int mid = (low + high)/2;

        if( high > mid && arr[mid] > arr[mid+1]){
            return mid ;
        }
        if( mid > low && arr[mid] < arr[mid-1]){
            return mid-1;
        }

        if(arr[mid] <= arr[low]){
            return findPivot(arr, low, mid-1);
        }else{
            return findPivot(arr, mid+1, high);
        }
    }


    public static int binarySearch(int arr[] , int low ,int high, int key){
        if(high < low){
            return -1;
        }
        int mid = (low + high)/2;
        if(key == arr[mid]){
            return mid;
        }
        if(key > arr[mid]){
            return binarySearch(arr, mid+1, high, key);
        }else{
            return binarySearch(arr, low, mid-1, key);
        }
    }


    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7,8, 0, 1, 2 , 3};
        int target = 0;
        System.out.println("Element Present on the Index Value : "+search(arr,0, arr.length-1, target));
    }   
}