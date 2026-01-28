
public class h {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(); // Flushing after printing list
    }

    public static void printListRev(Node head) {   // bcz fn call is before print therefore all calls will get stored in call stack
        // and in statck last in first out hota hai isiliye list rev me print hota hai 
        if (head == null) {
            return;
        }
        printListRev(head.next);
        System.out.print(head.data + " ");
    }

    public static int findLenght(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;

    }

    static void reverseListIterative(Node head) {
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
        }
        head.next = null;
        head = prevNode;

    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(6);
        Node n4 = new Node(9);
        Node n5 = new Node(7);
        Node n6 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        System.out.println("Original List:");
        printList(n1); // Ends with println(), so output is flushed

        // System.out.println("Reverse List:");
        // printListRev(n1);
        // System.out.println(); // flush after reverse print
        // System.out.println(" length:" + findLenght(n1));
                System.out.println("rev List:");
        reverseListIterative(n1);
        printList(n6);
    }
}
