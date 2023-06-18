import java.util.*;

public class _09_Median_Of_Two_SortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0;
        int high = nums1.length;
        int MedianPos = (nums1.length + nums2.length + 1) / 2;

        while(low <= high){
            int cut1 = (low + high) / 2;
            int cut2 = MedianPos - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int r1 = cut1 == nums1.length ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = cut2 == nums2.length ? Integer.MAX_VALUE : nums2[cut2];

            if(l1 <= r2 && l2 <= r1){
                if((nums1.length + nums2.length) % 2 == 0){
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }else{
                return Math.max(l1, l2);
                }
            }else if(l1 > r2){
                high = cut1 - 1;
            }else{
                low = cut1 + 1;
            }

        }

        return 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the First Array : ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter Elements of the First Array : "); 
        for(int i = 0 ; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Size of the Second Array : ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("Enter Elements of the Second Array : ");
        for(int i = 0 ; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.printf("Median of the Two Sorted Arrays is : " + "%.4f",findMedianSortedArrays(arr1, arr2));

        sc.close();
    }
}