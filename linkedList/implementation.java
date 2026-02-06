
class implementation {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // khud se nhi likhe to java auto null assign kar deta hai
        }
    }

    static class linkedlist {

        Node head = null;
        Node tail = null;
        static int size = 0;

        void addLast(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void addFirst(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void inserAtIndex(int val, int index) {
            Node newNode = new Node(val);
            Node temp = head;
            if (index == 0) {
                addFirst(val);
                return;
            }
            if (index == size) { // index agar length ke eql hoga to tail value 2nd last ko milega ye sort karne ke liye addlast
                addLast(val);
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        void delete(int index) {
            Node temp = head;
            if (index == 0) {
                head = head.next;
                size--;
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
                if (index == size) {
                    temp = tail;
                }
            }
            temp.next = temp.next.next;
            size--;
        }

        static void printList(Node head) {
            if (size <= 0) {
                System.out.println("[ null ]");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(" " + temp.data + " ->");
                if (temp.next == null) {
                    System.out.print(" null");
                    System.out.println(" ");
                    return;
                }
                temp = temp.next;
            }
            System.out.println("");
        }

        int findNth(int index) {
            // 1 2 3 4 5 6 7
            Node temp = head;
            for (int i = 1; i <= size - index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        int size() {     //iss fn la TC O(n) hai isko reduce karne ke liye top me size var declare kiya hai
            int count = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }

        int getMiddle() {
            Node slow = head;
            Node fast = head;
            if (size % 2 == 0) {
                while (fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow.data;
            }
            if (size % 2 != 0) {
                while (fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow.next.data;
            }
            return slow.data;
        }

        void deleteMiddle() {
            Node slow = head;
            Node fast = head;
            Node prev = null;
            while (fast.next.next != null && fast.next != null) {
                // isme aisa ho rha hai ki dono condition sahi hona chahiye 
                //ek bhi wrong hua to loop break hoga
                //(1)->(2)->(3)->(4)-null keliye jab
                //s 2 pe hota hai f 3 pe jisme f.n.n null hai
                //or hum kar rhe hai jab tak dono me se koi bhi null
                //na ho tab tak loop chale
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = slow.next;
        }

        int get(int index) {
            Node temp = head;
            int i = 0;
            while (i != index) {
                temp = temp.next;
                i++;
            }
            return temp.data;
        }
//  void reverseListIterative(Node head) {   //not working
//         Node prevNode = head;
//         Node currNode = head.next;
//         while (currNode != null) {
//             Node nextNode = currNode.next;
//             currNode.next = prevNode;
//             prevNode=currNode;
//             currNode=nextNode;
//         }
// head.next=null;
//         head = prevNode;
//         printList();
//     }
        // void reverseListIterative(Node head) {
        //     Node prevNode = null;
        //     Node currNode = head;
        //     Node nextNode = null;
        //     while (currNode != null) {
        //         nextNode = currNode.next;
        //         currNode.next = prevNode;
        //         prevNode = currNode;
        //         currNode = nextNode;
        //     }
        //     this.head = prevNode;
        // }

        void reverseKNode(Node head, int n) {
            if (size <= 0) {
                System.out.println("Empty List");
                return;
            }
            n = n % size;
            Node prev = head;
            Node curr = prev.next;
            for (int i = 1; i < size - n; i++) {
                prev = prev.next;
                curr = curr.next;
            }
            Node temp = curr;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head;
            prev.next = null;
            this.head = curr;
            System.out.println("reversed n Node of list");
        }

        // static void add2Num(Node head1, Node head2) {
        //     Node t1 = head1;
        //     Node t2 = head2;
        //     int sum = 0;
        //     int total = 0;
        //     int carry = 0;
        //     while (t1 != null || t2 != null) {
        //         sum = t1.data + t2.data;
        //         total = total + (sum+carry) / 10 ;
        //         carry=0;
        //         carry = sum % 10;
        //         t1 = t1.next;
        //         t2 = t2.next;
        //     }
        //     while (t1 != null) {
        //         sum =
        //     }
        // }
        // static Node mergeSorted(Node head1, Node head2) {
        //     Node temp1 = head1;
        //     Node temp2 = head2;
        //     Node dummy = new Node(-1);
        //     Node curr = dummy;
        //     while (temp1 != null && temp2 != null) {
        //         if (temp1.data <= temp2.data) {
        //             curr.next = temp1;
        //             temp1 = temp1.next;
        //         } else {
        //             curr.next = temp2;
        //             temp2 = temp2.next;
        //         }
        //         curr = curr.next;
        //     }
        //     if (temp1 != null) {
        //         curr.next = temp1;
        //     } else {
        //         curr.next = temp2;
        //     }
        //     return dummy.next;
        // }
        // static Node revList(Node head) {
        //     Node prev = null;
        //     Node curr = head;
        //     while (curr != null) {
        //         Node next = curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = next;
        //     }
        //     return prev;
        // }
        static Node mergeList(linkedlist list1, linkedlist list2) {
            Node t1 = list1.head;
            Node t2 = list2.head;
            Node dummy = new Node(-1);
            Node curr = dummy;
            while (t1 != null && t2 != null) {
                if (t1.data < t2.data) {
                    curr.next = t1;
                    t1 = t1.next;
                } else {
                    curr.next = t2;
                    t2 = t2.next;
                }
                curr = curr.next;
            }

            return dummy.next;
        }
    }

    public static void main(String[] args) {
        linkedlist list1 = new linkedlist();
        linkedlist list2 = new linkedlist();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);

        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        Node head = linkedlist.mergeList(list1, list2);
        linkedlist.printList(head);
    }
}
