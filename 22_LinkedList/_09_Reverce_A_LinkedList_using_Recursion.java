public class _09_Reverce_A_LinkedList_using_Recursion {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Implementaion of Insertion of a node at the end..
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // linkedlist in empty ..
        if (head == null) {
            head = new Node(newData);
            return;
        }

        // linkedlist is not empty ..
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    // Implementaion of Displaying the LinkedList ..
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Reverce using Recursion ..
    public void reverceRecursion(Node curr, Node prev) {
        // Base Case ..
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        }
        // Recursive Case ..
        Node nextPtr = curr.next;
        curr.next = prev;
        reverceRecursion(nextPtr, curr);
    }

    public static void main(String[] args) {

        _09_Reverce_A_LinkedList_using_Recursion list = new _09_Reverce_A_LinkedList_using_Recursion();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        list.display();

        list.reverceRecursion(list.head, null);
        list.display();
    }
}
