
//  Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return null ;
        }

        if(root == p || root == q){
            return root ;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root ;
        }
        if(left != null){
            return left ;
        }
        else{
            return right ;
        }
    }
}

public class _12_Least_Common_Ancestor_in_a_tree{
    public static void main(String[] args){
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left ;
        TreeNode q = root.right ;

        TreeNode ans = s.lowestCommonAncestor(root, p, q);
        System.out.println(ans.val);
    }
}