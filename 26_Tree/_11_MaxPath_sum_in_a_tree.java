import java.util.concurrent.atomic.AtomicInteger;
 
// A class to store a binary tree Node5
class Node5
{
    int data;
    Node5 left, right;
 
    Node5(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}
 
public class _11_MaxPath_sum_in_a_tree
{
    // Recursive function to find the maximum path sum "starting" from the
    // given Node5 in the binary tree.
    public static int findMaxPathSum(Node5 Node5, AtomicInteger result)
    {
        // base case: empty tree
        if (Node5 == null) {
            return 0;
        }
 
        // find maximum path sum "starting" from the left child
        int left = findMaxPathSum(Node5.left, result);
 
        // find maximum path sum "starting" from the right child
        int right = findMaxPathSum(Node5.right, result);
 
        // Try all possible combinations to get the optimal result
        int max = result.get();
        max = Integer.max(max, Node5.data);
        max = Integer.max(max, Node5.data + left);
        max = Integer.max(max, Node5.data + right);
        max = Integer.max(max, Node5.data + left + right);
        result.set(max);
 
        // return the maximum path sum "starting" from the given Node5
        return Integer.max(Node5.data, Node5.data + Integer.max(left, right));
    }
 
    public static void main(String[] args)
    {
        /* Construct the following tree
                1
              /   \
             /     \
            2      10
           / \    /  \
         -1  -4  -5   -6
             /   / \
            3   7   4
                 \
                 -2
        */
 
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.right = new Node5(10);
        root.left.left = new Node5(-1);
        root.left.right = new Node5(-4);
        root.right.left = new Node5(-5);
        root.right.right = new Node5(-6);
        root.left.right.left = new Node5(4);
        root.right.left.left = new Node5(7);
        root.right.left.right = new Node5(4);
        root.right.left.left.right = new Node5(-2);
 
        AtomicInteger result = new AtomicInteger(Integer.MIN_VALUE);
        findMaxPathSum(root, result);
        System.out.println("The maximum path sum is " + result);
    }
}