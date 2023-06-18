import java.util.Arrays;
import java.util.LinkedList;

public class _03_MergeInterval {
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        Solution sol = new Solution();
        int res[][] = sol.merge(arr);
        
        System.out.print("Result : [ ");
        for(int i=0; i<res.length; i++){
            System.out.print("["+res[i][0] + " " + res[i][1]+ "]");
        }
        System.out.print(" ] \n");
    }
}


class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. Sort the intervals in the increasing order of start value.. 
        // [0] - start
        // [1] - end
        // time complexity : O(n log n)
        // Space Complexity : O(n)

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));

        // 2. Iterate over all the intervals and check for the overlapping intervals.. 
        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval : intervals){
            // No OverLapping.. 
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }else{
                // overlapping.. 
                // max(LastEnd, end)
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int [merged.size()][]);
    }
}