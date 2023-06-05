import java.util.ArrayList;
import java.util.List;

public class _12_isPalindrome_LinkedList {

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

    // To check Palindorme in an LinkedList ..
    public boolean isPalindrome() {
        List<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }

        int low = 0;
        int high = list.size() - 1;

        while (low < high) {
            if (!list.get(low).equals(list.get(high))) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {

        _12_isPalindrome_LinkedList llist = new _12_isPalindrome_LinkedList();

        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);
        llist.insertAtEnd(2);
        llist.insertAtEnd(1);

        llist.display();

        System.out.println(llist.isPalindrome());
    }
}