import java.util.concurrent.atomic.AtomicInteger;
 
// A class to store a binary tree Node3
class Node3
{
    int data;
    Node3 left = null, right = null;
 
    Node3(int data) {
        this.data = data;
    }
}
 
public class _09_Diameter_of_Tree
{
    // Function to find the diameter of the binary tree. Note that the
    // function returns the height of the subtree rooted at a given Node3,
    // and the diameter is updated within the function as it is passed by
    // reference using the `AtomicInteger` class.
    public static int getDiameter(Node3 root, AtomicInteger diameter)
    {
        // base case: tree is empty
        if (root == null) {
            return 0;
        }
 
        // get heights of left and right subtrees
        int left_height = getDiameter(root.left, diameter);
        int right_height = getDiameter(root.right, diameter);
 
        // calculate diameter "through" the current Node3
        int max_diameter = left_height + right_height + 1;
 
        // update maximum diameter (note that diameter "excluding" the current
        // Node3 in the subtree rooted at the current Node3 is already updated
        // since we are doing postorder traversal)
        diameter.set(Math.max(diameter.get(), max_diameter));
 
        // it is important to return the height of the subtree rooted at the
        // current Node3
        return Math.max(left_height, right_height) + 1;
    }
 
    public static int getDiameter(Node3 root)
    {
        AtomicInteger diameter = new AtomicInteger(0);
        getDiameter(root, diameter);
 
        return diameter.get();
    }
 
    public static void main(String[] args)
    {
        Node3 root = new Node3(1);
        root.left = new Node3(2);
        root.right = new Node3(3);
        root.left.right = new Node3(4);
        root.right.left = new Node3(5);
        root.right.right = new Node3(6);
        root.right.left.left = new Node3(7);
        root.right.left.right = new Node3(8);
 
        System.out.print("The diameter of the tree is " + getDiameter(root));
    }
}
