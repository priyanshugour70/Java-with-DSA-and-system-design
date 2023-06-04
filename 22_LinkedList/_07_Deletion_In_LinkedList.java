public class _07_Deletion_In_LinkedList {
    // LinkedList Node..
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // To Display LinkedList ..
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Insert At End in LinkedList..
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // if LinkedList is Empty..
        if (head == null) {
            head = new Node(newData);
            return;
        }

        // if LinkedList in not Empty..
        newNode.next = null;
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    // Insert At Beginning in LinkedList..

    public void insertAtBeg(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;
        head = newNode;
    }

    // Insert At Given Position in LinkedList..

    public void insertAtAfter(Node pre_val, int newData) {
        Node newNode = new Node(newData);

        newNode.next = pre_val.next;
        pre_val.next = newNode;
    }

    // Deletion in a LinkedList..
    public void deleteNode(int position) {

        // Deletion is in the beginning of the node..
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }

        // deletion is not in the beginning of the node..
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp.next == null && temp.next.next == null) {
            return;
        }

        temp.next = temp.next.next;

    }

    public static void main(String[] args) {
        _07_Deletion_In_LinkedList l = new _07_Deletion_In_LinkedList();

        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);

        l.display();

        l.insertAtBeg(60);
        l.insertAtBeg(70);

        l.display();

        l.insertAtAfter(l.head.next.next, 80);
        l.insertAtAfter(l.head.next.next, 90);

        l.display();

        l.deleteNode(8);

        l.display();

    }
}
