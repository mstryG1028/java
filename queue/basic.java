
// import java.util.Queue;
// public class basic {
// //     static void reverseQ(Queue<Integer>q){
// //  Stack<Integer>st=new Stack<>();
// //     while(!q.isEmpty()){
// //         st.push(q.poll());
// //     }
// //     while(!st.isEmpty()){
// //         q.add(st.pop());
// //     }
// //     System.out.println(q);
// //     }
//     // static void reverseK(Queue<Integer> q, int k) {
//     //     Stack<Integer> st = new Stack<>();
//     //     int n = 1;
//     //     while (n <= k) {
//     //         st.push(q.poll());
//     //         n++;
//     //     }
//     //     n=1;
//     //     while (!st.isEmpty()) {
//     //         q.add(st.pop());
//     //     }
//     //     while(n<=q.size()-k){
//     //         q.add(q.poll());
//     //         n++;
//     //     }
//     //     System.out.println(q);
//     // }
//     public static class myStack {
//         Queue<Integer> q = new LinkedList<>();
//         public myStack() {
//         }
//         public void push(int val) {
//             q.add(val);
//         }
//         public int pop() {
//             for (int i=1;i<q.size();i++) {
//                 q.add(q.poll());
//             }
//             int x = q.poll();
//             return x;
//         }
//         public int peek() {
//             for (int i=1;i<q.size();i++) {
//                 q.add(q.poll());
//             }
//             int x = q.poll();
//             q.add(x);
//             return x;
//         }
//         public void print() {
//             System.out.println(q);
//         }
//     }
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         // System.out.println(q);
//         // reverseQ(q);
//         // System.out.println(q);
//         // reverseK(q, 4);
//         myStack st = new myStack();
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);
//         st.push(5);
//         System.out.println(st.pop());
//         st.print();
//         System.out.println(st.peek());
//         st.print();
//     }
// }



