public class _06_Maxima_and_Minima {

    // Time Complexity : O(n)
    // Time Complexity : O(n)

    static class Pair {
        int min ;
        int max ;
    }

    // Function Definition .. 
    public static Pair getMinMax(int [] arr, int i , int j){
        Pair minmax = new Pair();
        Pair minmaxLeft = new Pair();
        Pair minmaxRight = new Pair();

        // 1. Small Problem 
        // if numbver of elements is equal to 1 .. 
        if(i == j){
            minmax.min = arr[i];
            minmax.max = arr[i];
            return minmax ;
        }

        // if number of elements is equal to 2 ..
        else if(i == j-1){
            if(arr[i] < arr[j]){
                minmax.min = arr[i];
                minmax.max = arr[j];
            }else{
                minmax.min = arr[j];
                minmax.max = arr[i];
            }
            return minmax ;
        }

        // 2. Big Problem - Divide and Conquer Approach .. 
        else{
            // 1. Divide.. 
            int mid = i + (j-i)/2 ;

            // 2. Conquer ..
            minmaxLeft = getMinMax(arr, i, mid);
            minmaxRight = getMinMax(arr, mid+1, j);

            // 3. Combine ..

            // Compare the minimum of left and right subarray ..
            if(minmaxLeft.min < minmaxRight.min){
                minmax.min = minmaxLeft.min ;
            }else{
                minmax.min = minmaxRight.min ;
            }

            // Compare the maximum of left and right subarray ..
            if(minmaxLeft.max < minmaxRight.max){
                minmax.max = minmaxRight.max ;
            }else{
                minmax.max = minmaxLeft.max ;
            }

            return minmax ;
        }
    }

    public static void main(String[] args) {
        int [] arr = { 50, 45, 11, 9, 15, 75, 89, 97};
        int n = arr.length ;

        Pair minmax = getMinMax(arr, 0, n-1);

        System.out.println("The Smallest Element in an Array is : " + minmax.min);
        System.out.println("The Largest Element in an Array is : " + minmax.max);
    }
}