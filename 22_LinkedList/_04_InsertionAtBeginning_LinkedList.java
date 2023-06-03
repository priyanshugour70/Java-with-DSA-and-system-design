public class _04_InsertionAtBeginning_LinkedList {

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

    // Insertion a Element At Beginninng in LinkedList..
    public void insertAtBeg(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // To Display the LinkedList..
    public void Display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        _04_InsertionAtBeginning_LinkedList list = new _04_InsertionAtBeginning_LinkedList();

        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtBeg(30);
        list.insertAtBeg(40);
        list.insertAtBeg(50);

        list.Display();
    }
}
