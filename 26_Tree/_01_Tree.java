// Create a Tree with 1 to 10 values and print it.
class  Node {
    int val;
    Node left;
    Node right;
    Node next;
    
    Node() {}
    
    Node(int val) { 
        this.val = val; 
        this.left = null;
        this.right = null;
    }    
}

public class _01_Tree {
    public static void main(String[] args) {

        // Enter 1 to 10 values in the Tree one by one.. 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(5);
        root.right.left  = new Node(6);
        root.right.right  = new Node(7);
        root.left.left.left  = new Node(8);
        root.left.left.right  = new Node(9);
        root.left.right.left  = new Node(10);
    }
}
