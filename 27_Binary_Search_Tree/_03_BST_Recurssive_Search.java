// A class to store a BST Node2
class Node2
{
    int data;
    Node2 left = null, right = null;
 
    Node2(int data) {
        this.data = data;
    }
}
 
class _03_BST_Recurssive_Search
{
    // Recursive function to insert a key into a BST
    public static Node2 insert(Node2 root, int key)
    {
        // if the root is null, create a new Node2 and return it
        if (root == null) {
            return new Node2(key);
        }
 
        // if the given key is less than the root Node2, recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // if the given key is more than the root Node2, recur for the right subtree
        else {
            root.right = insert(root.right, key);
        }
 
        return root;
    }
 
    // Recursive function to search in a given BST
    public static void search(Node2 root, int key, Node2 parent)
    {
        // if the key is not present in the key
        if (root == null)
        {
            System.out.println("Key not found");
            return;
        }
 
        // if the key is found
        if (root.data == key)
        {
            if (parent == null) {
                System.out.println("The Node2 with key " + key + " is root Node2");
            }
 
            else if (key < parent.data)
            {
                System.out.println("The given key is the left Node2 of the Node2 " +
                            "with key " + parent.data);
            }
            else {
                System.out.println("The given key is the right Node2 of the Node2 " +
                            "with key " + parent.data);
            }
 
            return;
        }
 
        // if the given key is less than the root Node2, recur for the left subtree;
        // otherwise, recur for the right subtree
 
        if (key < root.data) {
            search(root.left, key, root);
        }
        else {
            search(root.right, key, root);
        }
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
 
        Node2 root = null;
        for (int key: keys) {
            root = insert(root, key);
        }
 
        search(root, 25, null);
    }
}