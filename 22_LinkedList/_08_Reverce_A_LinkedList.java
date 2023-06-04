public class _08_Reverce_A_LinkedList {
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

    // Reverce LinkedList..
    public void reverceLinkedList() {

        Node curr = head;
        Node prev = null;
        Node nextPtr = null;
        while (curr != null) {
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }
        head = prev;
        return;
    }

    public static void main(String[] args) {
        _08_Reverce_A_LinkedList l = new _08_Reverce_A_LinkedList();

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

        l.reverceLinkedList();

        l.display();

    }
}