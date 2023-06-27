// A class to store a BST Node1
class Node1
{
    int data;
    Node1 left, right;
 
    // Function to create a new binary tree Node1 having a given key
    Node1(int key)
    {
        data = key;
        left = right = null;
    }
}
 
class _02_BST_Insertion_Iterativly
{
    // Function to perform inorder traversal on the tree
    public static void inorder(Node1 root)
    {
        if (root == null) {
            return;
        }
 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
 
    // Iterative function to insert a key into a BST
    public static Node1 insertIterative(Node1 root, int key)
    {
        // start with the root Node1
        Node1 curr = root;
 
        // pointer to store the parent of the current Node1
        Node1 parent = null;
 
        // if the tree is empty, create a new Node1 and set it as root
        if (root == null) {
            return new Node1(key);
        }
 
        // traverse the tree and find the parent Node1 of the given key
        while (curr != null)
        {
            // update the parent to the current Node1
            parent = curr;
 
            // if the given key is less than the current Node1,
            // go to the left subtree; otherwise, go to the right subtree.
            if (key < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
 
        // construct a Node1 and assign it to the appropriate parent pointer
        if (key < parent.data) {
            parent.left = new Node1(key);
        }
        else {
            parent.right = new Node1(key);
        }
 
        return root;
    }
 
    // Function to construct a BST from given keys
    public static Node1 constructBST(int[] keys)
    {
        Node1 root = null;
        for (int key: keys) {
            root = insertIterative(root, key);
        }
        return root;
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
 
        Node1 root = constructBST(keys);
        inorder(root);
    }
}