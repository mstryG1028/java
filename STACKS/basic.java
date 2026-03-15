package STACKS;

// import java.util.Stack;
// public class basic {
//     static boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             char curr = s.charAt(i);
//             if (curr == '[' || curr == '{' || curr == '(') {
//                 st.push(curr);
//             } else if (curr == ']' || curr == '}' || curr == ')') {
//                    if (st.isEmpty()) {
//                 return false; // No opening bracket for this closing
//             }
//             char top=st.peek();
//                 if (curr==']'&& top !='['||curr=='}'&& top !='{'||curr==')'&& top !='(') {
//                     return false;
//                 } else {
//                     st.pop();
//                 }
//             }
//         }
//         return st.isEmpty();
//     }
//     public static void main(String[] args) {
//         String s = "{{[]}}()[]";
//         System.out.println(isValid(s));
//     }
// }
// class basic {
// static void printSqr(int row,int col){
//     for(int i=0;i<row;i++){
//         for(int j=0;j<col;j++){
//             System.out.print("*"+ " ");
//         }
//         System.out.println();
//     }
// }
// static void print(int max) {
//     int k = 1;
//     for(int i=1;i<=max;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(k+ " ");
//             k++;
//         }
//         if(k==max){
//             break;
//         }
//         System.out.println();
//     }
// }
// static void print(int r, int c) {
//         ----------------*******------------
// for(int i=0;i<r;i++){
//     for(int j=c;j>=1;j--){
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }
//  ----------------*******------------
//   int p=0;
//   for(int i=0;i<r;i++){
//     for(int j=0;j<c;j++){
//         if(p==0){
//             p=1;
//         }else{
//             p=0;
//         }
//         System.out.print(p+" ");
//     }
//     System.out.println();
//   }
//  ----------------*******------------
//     int p=0;
//   for(int i=0;i<r;i++){
//     for(int j=0;j<c;j++){
//         if(p==0){
//             p=1;
//         }else{
//             p=0;
//         }
//         if(j==c-1||j==0){
//             p=1;
//         }
//         System.out.print(p+" ");
//     }
//     System.out.println();
//   }
//  ----------------*******------------
//       for(int i=0;i<r;i++){
//         for(int j=0;j<c;j++){
//             if(i==0||j==0||i==c-1||j==r-1){
//                 System.out.print("*"+" ");
//             }else{
//                 System.out.print(" "+ " ");
//             }
//         }
//         System.out.println();
//       }
//     }
//     public static void main(String[] args) {
//         print(5,5);
//     }
// }
// class Person {
//     String name;
//     int age;
//     char gen;
//     Person(String name, int age, char gen) {
//         this.name = name;
//         this.age = age;
//         this.gen = gen;
//     }
// }
// class Student extends Person {
//     int roll;
//     double per;
//     String coll;
//     Student(String name, int age, char gen, int roll, double per, String coll) {
//         super(name, age, gen);
//         this.roll = roll;
//         this.per = per;
//         this.coll = coll;
//     }
//     void printStudentInfo() {
//         System.out.println(name + " " + age + " " + gen + " " + roll + " " + per + " " + coll);
//     }
// }
// class Teacher extends Student {
//     String desig;
//     Teacher(String name, int age, char gen, int roll, double per, String coll, String desig) {
//         super(name, age, gen, roll, per, coll);
//         this.desig = desig;
//     }
//     void printTeacherInfo() {
//         System.out.println(name + " " + age + " " + gen + " " + roll + " " + per + " " + coll + " " + desig);
//     }
// }
// class basic {
//     public static void main(String[] args) {
//         // here we are using 2 constructor to make single object this is called constructor chaining
//         Student s1 = new Student("deepak", 20, 'm', 21, 78.45, "ssj");
//         s1.printStudentInfo();
//         // here we are using 3 constructor to make single object this is called constructor chaining
//         //we can use multiple chaining
//         Teacher t1 = new Teacher("deepak", 20, 'm', 21, 78.45, "ssj", "teach");
//         t1.printTeacherInfo();
//     }
// }
class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
    

}

public class basic {

    double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // System.out.println(basic.add(2, 2.4));

        // Calculator calc = new Calculator();
        // System.out.println(calc.add(5, 3));     // calls int version
        // System.out.println(calc.add(5.5, 3.2)); // calls double version
    }
}
