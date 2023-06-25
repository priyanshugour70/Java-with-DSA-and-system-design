import java.util.ArrayDeque;
import java.util.Queue;
 
// A class to store a binary tree Node2
class Node2
{
    int key;
    Node2 left = null, right = null;
 
    Node2(int key) {
        this.key = key;
    }
}
 
public class _08_Level_Order_Traversal_using_Queue
{
    // Function to print level order traversal of a given binary tree
    public static void levelOrderTraversal(Node2 root)
    {
        // base case
        if (root == null) {
            return;
        }
 
        // create an empty queue and enqueue the root Node2
        Queue<Node2> queue = new ArrayDeque<>();
        queue.add(root);
 
        // to store the current Node2
        Node2 curr;
 
        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // process each Node2 in the queue and enqueue their
            // non-empty left and right child
            curr = queue.poll();
 
            System.out.print(curr.key + " ");
 
            if (curr.left != null) {
                queue.add(curr.left);
            }
 
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }
 
    public static void main(String[] args)
    {
        Node2 root = new Node2(15);
        root.left = new Node2(10);
        root.right = new Node2(20);
        root.left.left = new Node2(8);
        root.left.right = new Node2(12);
        root.right.left = new Node2(16);
        root.right.right = new Node2(25);
 
        levelOrderTraversal(root);
    }
}