// package OOPS;

// import java.util.Stack;

// // class Engine{
// //     String Ename;
// //     double power;
// //     Engine(String name,double power){
// //         this.Ename=name;
// //         this.power=power;
// //     }
// // void print(){
// //     System.out.println(Ename+" "+ power);
// // }
// // }
// // public class Car {
// //     String name;
// //     Engine eng;
// //     Car(String name,String Ename,double power){
// //         this.name=name;
// //         this.eng=new Engine(Ename,power);
// //     }
// //     void print(){
// //         System.out.println(name+" ");
// //         eng.print();
// //     }
// //     public static void main(String[] args) {
// //         Car c=new Car("bmw","hd",23);
// //         c.print();
// //     }
// // }
// // class Employee {
// //     String name;
// //     final String id;
// //     private static int random = 100; // if we dont use private here then at main we anyone can change value
// //     //which is not good
// //     Employee(String name) {
// //         this.name = name;
// //         this.id = "JPM" + random++;
// //     }
// //     void display(){
// //         System.out.println("name is: "+ name+" id is: "+id);
// //     }
// // }
// // public class Car{
// //     public static void main(String[] args) {
// //             // Employee.random=500; // this is valid if we dont use private in class Employee
// //         Employee e1=new Employee("e1");
// //                 Employee e2=new Employee("e2");
// //                 e1.display();
// //                 e2.display();
// //     }
// // }
// class Car {

//     static boolean isPalindrome(String s) {
//         int start = 0;
//         int end = s.length() - 1;
//         while (start <= end) {
//             if (s.charAt(start) != s.charAt(end)) {
//                 return true;
//             }
//         }
//         return true;
//     }

//     static String revstr(String s) {
//         int i = s.length() - 1;
//         String rev = "";
//         while (i >= 0) {
//             rev += s.charAt(i);
//             i--;
//         }
//         return rev;
//     }

//     // static void countVewels(String s) {
//     //     int vCount = 0, cCount = 0;
//     //     for (int i = 0; i < s.length(); i++) {
//     //         char curr = s.charAt(i);
//     //         if (curr == 'A' || curr == 'a'
//     //                 || curr == 'U' || curr == 'u'
//     //                 || curr == 'E' || curr == 'e'
//     //                 || curr == 'I' || curr == 'i'
//     //                 || curr == 'O' || curr == 'o') {
//     //             vCount++;
//     //         } else {
//     //             cCount++;
//     //         }
//     //     }
//     //     System.out.println("vCount is:"+vCount + " and cCount is: "+cCount);
//     // }
//     static boolean validParenthesis(String s) {
//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < s.length() ; i++) {
//             char ch = s.charAt(i);

//             // s="({[]})"
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 st.push(ch);
//             } else if (ch == ')' || ch == '}' || ch == ']') {
//                 if (st.isEmpty()) {
//                     return false;
//                 }
            
//             char currSt = st.peek();
//             if (ch == ')' && currSt != '(' || ch == '}' && currSt != '{' || ch == ']' && currSt != '[') {
//                 return false;
//             } else {
//                 st.pop();
//             }
//         }

//         }

//         return st.isEmpty();
//     }

//     public static void main(String[] args) {
//         // System.out.println(isPalindrome("karan"));
//         // System.out.println(revstr("Karan"));
//         // countVewels("AUDIO");
//         System.out.println(validParenthesis("({[]}"));
//     }
// }
package  OOPS;
class Employee{
    final int id;
    String name;
    private static int random=3000;
    Employee(String name){
    this.id=random++;
    this.name=name;
   }
   void print(){
    System.out.println(id+" "+name);
    System.out.println(random);
   }
}
public class Car{
    public static void main(String[] args) {
        Employee e1=new Employee("deepak");
        e1.print();
                Employee e2=new Employee("ghf");
                
                e2.print();
    }
}