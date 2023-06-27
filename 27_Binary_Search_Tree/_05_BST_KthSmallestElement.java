import java.util.concurrent.atomic.AtomicInteger;
 
// A class to store a binary tree Node4
class Node4
{
    int data;
    Node4 left, right;
 
    Node4(int data) {
        this.data = data;
    }
}
 
class _05_BST_KthSmallestElement
{
    // Recursive function to find the k'th smallest Node4
    // in the BST (using inorder traversal)
    public static Node4 kthSmallest(Node4 root, AtomicInteger counter, int k)
    {
        // base case
        if (root == null) {
            return null;
        }
 
        // recur for the left subtree
        Node4 left = kthSmallest(root.left, counter, k);
 
        // if k'th smallest Node4 is found
        if (left != null) {
            return left;
        }
 
        // if the root is k'th smallest Node4
        if (counter.incrementAndGet() == k) {
            return root;
        }
 
        // recur for the right subtree only if k'th smallest Node4 is not found
        // in the right subtree
        return kthSmallest(root.right, counter, k);
    }
 
    // Function to find the k'th smallest Node4 in the BST
    public static Node4 findKthSmallest(Node4 root, int k)
    {
        // Counter to keep track of the total number of the visited Node4s.
        // `AtomicInteger` is used here since `Integer` is passed by value in Java
        AtomicInteger counter = new AtomicInteger(0);
 
        // Recursively find the k'th smallest Node4
        return kthSmallest(root, counter, k);
    }
 
    public static void main(String[] args)
    {
        /* Construct the following BST
                  15
                /    \
               /      \
              10       20
             /  \     /  \
            /    \   /    \
           8     12 16    25
        */
 
        Node4 root = new Node4(15);
        root.left = new Node4(10);
        root.right = new Node4(20);
        root.left.left = new Node4(8);
        root.left.right = new Node4(12);
        root.right.left = new Node4(16);
        root.right.right = new Node4(25);
 
        int k = 4;
 
        // find the k'th smallest Node4
        Node4 result = findKthSmallest(root, k);
 
        if (result != null) {
            System.out.printf("%d'th smallest Node4 is %d", k, result.data);
        }
        else {
            System.out.printf("%d'th smallest Node4 does not exist.", k);
        }
    }
}