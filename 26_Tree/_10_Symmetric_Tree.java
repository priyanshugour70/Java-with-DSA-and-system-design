// A class to store a binary tree Node4
 class Node4 {
     int data;
     Node4 left = null, right = null;

     Node4(int data) {
         this.data = data;
     }
 }

 public class _10_Symmetric_Tree {
     //Function to check is the tree is symmetric for left Node4 and right Node4.
     static boolean checkSymmetric(Node4 leftNode4, Node4 rightNode4) {
         if (leftNode4 == null && rightNode4 == null) {
             return true;
         }
         if (leftNode4 == null || rightNode4 == null) {
             return false;
         }
         if (leftNode4.data != rightNode4.data) {
             return false;
         }
         return checkSymmetric(leftNode4.left, rightNode4.right) && checkSymmetric(leftNode4.right, rightNode4.left);

     }

     public static void main(String[] args) {
         /*

         1
       /   \
      /     \
      2      2
     / \    / \
    /   \  /   \
   4    5  5    4

        */

         Node4 root = new Node4(1);
         root.left = new Node4(2);
         root.right = new Node4(2);
         root.left.right = new Node4(5);
         root.left.left = new Node4(4);
         root.right.right = new Node4(4);
         root.right.left = new Node4(5);

         System.out.print("The given tree is Symmetric: " + checkSymmetric(root.left, root.right));


     }
 }