// A class to store a BST Node3
class Node3
{
    int data;
    Node3 left = null, right = null;
 
    Node3(int data) {
        this.data = data;
    }
}
 
class _04_BST_Deletetion
{
    // Function to perform inorder traversal on the BST
    public static void inorder(Node3 root)
    {
        if (root == null) {
            return;
        }
 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
 
    // Helper function to find minimum value Node3 in the subtree rooted at `curr`
    public static Node3 getMinimumKey(Node3 curr)
    {
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
 
    // Recursive function to insert a key into a BST
    public static Node3 insert(Node3 root, int key)
    {
        // if the root is null, create a new Node3 and return it
        if (root == null) {
            return new Node3(key);
        }
 
        // if the given key is less than the root Node3, recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // if the given key is more than the root Node3, recur for the right subtree
        else {
            root.right = insert(root.right, key);
        }
 
        return root;
    }
 
    // Function to delete a Node3 from a BST
    public static Node3 deleteNode3(Node3 root, int key)
    {
        // pointer to store the parent of the current Node3
        Node3 parent = null;
 
        // start with the root Node3
        Node3 curr = root;
 
        // search key in the BST and set its parent pointer
        while (curr != null && curr.data != key)
        {
            // update the parent to the current Node3
            parent = curr;
 
            // if the given key is less than the current Node3, go to the left subtree;
            // otherwise, go to the right subtree
            if (key < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
 
        // return if the key is not found in the tree
        if (curr == null) {
            return root;
        }
 
        // Case 1: Node3 to be deleted has no children, i.e., it is a leaf Node3
        if (curr.left == null && curr.right == null)
        {
            // if the Node3 to be deleted is not a root Node3, then set its
            // parent left/right child to null
            if (curr != root)
            {
                if (parent.left == curr) {
                    parent.left = null;
                }
                else {
                    parent.right = null;
                }
            }
            // if the tree has only a root Node3, set it to null
            else {
                root = null;
            }
        }
 
        // Case 2: Node3 to be deleted has two children
        else if (curr.left != null && curr.right != null)
        {
            // find its inorder successor Node3
            Node3 successor = getMinimumKey(curr.right);
 
            // store successor value
            int val = successor.data;
 
            // recursively delete the successor. Note that the successor
            // will have at most one child (right child)
            deleteNode3(root, successor.data);
 
            // copy value of the successor to the current Node3
            curr.data = val;
        }
 
        // Case 3: Node3 to be deleted has only one child
        else {
            // choose a child Node3
            Node3 child = (curr.left != null)? curr.left: curr.right;
 
            // if the Node3 to be deleted is not a root Node3, set its parent
            // to its child
            if (curr != root)
            {
                if (curr == parent.left) {
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }
 
            // if the Node3 to be deleted is a root Node3, then set the root to the child
            else {
                root = child;
            }
        }
 
        return root;
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 15, 10, 20, 8, 12, 16 };
 
        Node3 root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
 
        root = deleteNode3(root, 16);
        inorder(root);
    }
}