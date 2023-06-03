public class _05_InsertionAtAfter_LinkedList {

    // Node Stracture..
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Display the LinkedList..
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Insert After an Element..
    public void insertAtAfter(Node pre_val, int newData) {
        if (pre_val == null) {
            System.out.println("The Previous node cannot contain null Values..");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = pre_val.next;
        pre_val.next = newNode;
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

    public static void main(String[] args) {
        _05_InsertionAtAfter_LinkedList list = new _05_InsertionAtAfter_LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.display();

        list.insertAtAfter(list.head.next.next, 25);
        list.display();
    }
}
