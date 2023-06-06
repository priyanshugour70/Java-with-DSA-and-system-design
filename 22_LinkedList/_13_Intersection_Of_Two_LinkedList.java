public class _13_Intersection_Of_Two_LinkedList {

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

    // Main Intersection Code Start From Here ..
    public int length(Node list) {
        int count = 0;
        while (list != null) {
            count++;
            list = list.next;
        }
        return count;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        int LA = length(headA);
        int LB = length(headB);

        Node cA = null;
        Node cB = null;
        int diff = 0;

        if (LA > LB) {
            cA = headA;
            cB = headB;
            diff = LA - LB;
        } else {
            cA = headB;
            cB = headA;
            diff = LB - LA;
        }

        while (diff != 0) {
            cA = cA.next;
            diff--;
        }

        while (cA != null && cB != null) {
            if (cA == cB) {
                return cA;
            }
            cA = cA.next;
            cB = cB.next;
        }

        return null;
    }

    public static void main(String[] args) {
        // This is a LeetCode Problem ..
        // Problem No. 160. Intersection of Two Linked Lists
    }

}