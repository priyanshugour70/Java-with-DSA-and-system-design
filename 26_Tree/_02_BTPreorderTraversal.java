import java.util.ArrayList;
import java.util.List;

public class _02_BTPreorderTraversal {
    public static void main(String[] args) {
        
    }
}

class Solution {
    List<Integer> L = new ArrayList<>();
    public List<Integer>
        preorderTraversal(TreeNode root) {
        if(root==null){
            return L;
        }
        L.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return L;
    }
}