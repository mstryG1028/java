
// FIXED SIZE
// MEMORY CONSUMPTIO LESS
//OVERFLOW YES
// class stack { //USING ARRAY
//     int arr[];
//     int top;
//     int size;
//     stack(int size) {
//         this.size = size;
//         arr = new int[size];
//         top = -1;
//     }
//     void push(int x) {
//         if (top == size - 1) {
//             System.out.println("Stack overflow");
//             return;
//         }
//         arr[++top] = x;
//     }
//     int peek() {
//         // top element ko deta hai top bhi bolte hai
//         if (top == -1) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }
//         return arr[top];
//     }
//     int pop() { // removed element ko deta hai
//         if (top == -1) {
//             System.out.println("Stack Underflow");
//             return -1;
//         }
//         return arr[top--];
//     }
//     boolean isEmpty() {
//         return top == -1;
//     }
//     void printStack() {
//         int i = top;
//         if (i == 0) {
//             System.out.println("Empty Stack");
//         }
//         while (i >= 0) {
//             System.out.println(arr[i--]);
//         }
//     }
//     int size() {
//         return size;
//     }
// }

// SIZE DYNAMIC
// MEMOMY CONSUMPTION MORE
// OVERFLOW-NO
class stack {

    //pehle ek node class bnaye or const me usko null value assigned
    class Node {

        int data;
        Node next;

        //jab bhikoi new val aayega to ek new node bna denge
        // uske next ko top pe point kra denge or currNode kotop bna denge
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    stack() {
        top = null;
    }

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int peek() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    int pop() {
        if (top == null) {
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    boolean isEmpty() {
        return top == null;
    }

    void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Imple {

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.printStack();

    }
}
