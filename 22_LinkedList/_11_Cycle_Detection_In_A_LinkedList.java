public class _11_Cycle_Detection_In_A_LinkedList {

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

    // To Check Cycle Detection in an LinkedList ..
    public void cycleDetection() {
        Node fast = head;
        Node slow = head;
        int flag = 0;

        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("No Cycle Found in the LinkedList");
        } else {
            System.out.println("Cycle Found in the LinkedList");
        }
    }

    public static void main(String[] args) {

        _11_Cycle_Detection_In_A_LinkedList list = new _11_Cycle_Detection_In_A_LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        list.display();
        list.cycleDetection();

    }
}
