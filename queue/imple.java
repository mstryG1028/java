
// //  class queue {  //USING ARRAY
// //     int arr[];
// //     int size;
// //     int front;
// //     int rear;
// //     queue(int size) {
// //         this.size = size;
// //         arr = new int[size];
// //         front = 0;
// //         rear = -1;
// //     }
// //     void enqueue(int x) {
// //         if (rear == size - 1) {
// //             System.out.println("overflow");
// //             return;
// //         }
// //         arr[++rear] = x;
// //     }
// //     int dequeue() { //pop of stack
// //         if (rear == -1) {
// //             System.out.println("underflow");
// //             return -1;
// //         }
// //         return arr[front++];
// //     }
// //     int peek() {
// //         if (rear == -1) {
// //             System.out.println("underflow");
// //             return -1;
// //         }
// //         return arr[front];
// //     }
// //     boolean isEmpty() {
// //         return front > rear;
// //     }
// // }
// class queue { //USING LL
//     class Node {
//         int data;
//         Node next;
//         Node(int x) {
//             this.data = x;
//             this.next = null;
//         }
//     }
//     Node front, rear;
//     queue() {
//         front = rear = null;
//     }
//     void enqueue(int x) {
//         Node newNode = new Node(x);
//         if (rear == null) {
//             front = rear = newNode;
//             return;
//         }
//         //jo newNode ban rha hai usme data hai or data.next=null hai
//         //to hum kya kar rhe hai 
//         //  f or r dono ise pnt kar rhe hai 1 ko: (1)->null
// // to hum front ko waise hi rehne denge or rear.next=newNode;
// //phir usi newNode ko rear bna denge
// //to ab ll will be (1)->(2)->null
// //ab f (1) ko or r (2) ko pnt kar rha hai
//         rear.next = newNode;
//         rear = newNode;
//     }
//     int dequeue() {
//         if (front == null) {
//             System.out.println("underflow");
//             return -1;
//         }
//         int ans = front.data;
//         front = front.next;
//         if (front == null) {
//             rear = null;
//         }
//         return ans;
//     }
//     int peek() {
//         if (front == null) {
//             System.out.println("underflow");
//             return -1;
//         }
//         return front.data;
//     }
//     boolean isEmpty() {
//         return front == null;
//     }
// }
// public class imple {
//     public static void main(String[] args) {
//         queue q = new queue();
//         q.enqueue(1);
//         // q.enqueue(2);
//         // q.enqueue(3);
//         // q.enqueue(4);
//         System.out.println(q.isEmpty());
//         System.out.println(q.peek());
//         System.out.println(q.dequeue());
//         System.out.println(q.isEmpty());
//         System.out.println(q.peek());
//         System.out.println(q.dequeue());
//     }
// }
class imple {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    class Q {

        Node head;
        Node tail;
        int size = 0;

        void enque(int val) {
            Node curr = new Node(val);
            if (head == null) {
                head = tail = curr;
            }else{
                tail.next=curr;
                tail=curr;
            }

        }
    }

    public static void main(String[] args) {

    }
}
