// A class to store a binary tree Node1
class Node1
{
    int key;
    Node1 left = null, right = null;
 
    Node1(int key) {
        this.key = key;
    }
}

public class _07_Level_Order_Traversal_using_Recursion
{
    // Function to print all Node1s of a given level from left to right
    public static boolean printLevel(Node1 root, int level)
    {
        // base case
        if (root == null) {
            return false;
        }
 
        if (level == 1)
        {
            System.out.print(root.key + " ");
 
            // return true if at least one Node1 is present at a given level
            return true;
        }
 
        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);
 
        return left || right;
    }
 
    // Function to print level order traversal of a given binary tree
    public static void levelOrderTraversal(Node1 root)
    {
        // start from level 1 — till the height of the tree
        int level = 1;
 
        // run till printLevel() returns false
        while (printLevel(root, level)) {
            level++;
        }
    }
 
    public static void main(String[] args)
    {
        Node1 root = new Node1(15);
        root.left = new Node1(10);
        root.right = new Node1(20);
        root.left.left = new Node1(8);
        root.left.right = new Node1(12);
        root.right.left = new Node1(16);
        root.right.right = new Node1(25);
 
        levelOrderTraversal(root);
    }
}