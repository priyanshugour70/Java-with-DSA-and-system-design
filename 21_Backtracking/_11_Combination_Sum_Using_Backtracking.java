import java.util.ArrayList;
import java.util.List;

public class _11_Combination_Sum_Using_Backtracking {
    public static void main(String[] args) {

        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;

        Solution sol = new Solution();

        List<List<Integer>> result = sol.combinationSum(candidates, target);

        System.out.println(result);
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<>(temp));
            return; // Add the missing return statement
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue; // Optimization: Skip unnecessary recursive calls
            }

            // Add
            temp.add(candidates[i]);

            // Recursive call
            backtrack(result, temp, candidates, target - candidates[i], i);

            // Backtracking
            temp.remove(temp.size() - 1);
        }
    }
}
