package QUIZ;

public class B {

    // this is called varags which is used to take multiple inputs
    // static int sum(int... numbers){ // 
    //      int sum=0;
    //     for(int num:numbers){
    //         sum+=num;
    //     }
    //     return sum;
    // }
    // static String sum(char... characters) { // 
    //     String word = "";
    //     for (int i = 0; i < characters.length; i++) {
    //         word += characters[i];
    //     }
    //     return word;
    // }
    public static void main(String[] args) {
        // System.out.println(sum(1,2,3,4,5)); //op=15
        // System.out.println(sum('a','p','p','l','e')); //op apple

        // int[] arr1 = {1, 2, 3};
        // int[] arr2 = arr1; // this is valid since arr1 nad arr 2 both ref to {1,2,3} object
        // arr2[0] = 10;
        // System.out.println(arr1[0]);
        // System.out.println(arr2[0]);
        // // method to copy arr
        // int[] arr3 = Arrays.copyOf(arr1, arr1.length);
        // System.out.println(arr3[2]);
        //  String properties
        // String s="deepak";
        // String s1="deepak";
        // System.out.println(s==s1); // this will give true  since s and s1 is diff var with same memory location
        // String s=new String("deepak");
        // String s1=new String("deepak");
        // System.out.println(s==s1); // this will give false since s and s1 is diff object with diff memory location
        // String name = "dee";
        // name += "pak"; // due to concate this will form new object with diff location
        // String name1 = "deepak";
        // System.out.println(name == name1); //this will give false
        // String, stringbuilder and Stringbuffer
        // NOTE: we can cretae string as
        // String s=new String("Deepak");
        // MEMORY: all these are stored in heap memory ,whenever ther is new kw then it will stored in heap
// in above ex s- stored in stack and Deepak- stored in heap
        String s = "hello";
        // yahan pe concate ho rha hai but uska location dif hai s se
        s.concat("world"); // this will not afect the s bcz str is immutable

        String str = s.concat("world"); // op helloworld
        System.out.println(s);

        //since buffer is synchronized therefore its thread safe
        //syncronized meaning only one thred can use method at a time
        StringBuffer s2 = new StringBuffer("hello");
        s2.append("world");
        System.out.println(s2);

        // since builder is not syncronized therfore it is not thread safe but fast
        StringBuilder s1 = new StringBuilder("hello");
        s1.append("world"); //but this will affect bcz strbuilder abd buffer is mutable
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Deepak");
        StringBuffer sb2 = sb;
        //since we are assigning it before appneding but sb and sb2 always points same location
        sb.append("Mistry");
        System.out.println(sb); //op Deepak Mistry
        System.out.println(sb2); // op Deepak Mistry
//NOTE: same for stringBuilder

// class Demo {
//     int num;
//     Demo() {
//         this(100);
//         System.out.println("Default Constructor");
//     }
//     Demo(int n) {
//         num = n;
//         System.out.println("Parameterized Constructor");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Demo obj = new Demo();  op parameterized constructor
        // Default constructor
//     }
// }

// class Base {
//     Base() {
//         System.out.println("Base Constructor");
//     }
// }
// class Derived extends Base {
//     Derived() {
//         System.out.println("Derived Constructor");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Derived obj = new Derived(); op Base constructor 
//     }                                  Derived constructor
// }
    }
}

// static means “belongs to a class, not to an object.”
// A top-level class does not belong to any other class, so there is nothing for it to be static of.
// therfore belo code is wrong (compile time err)
//  static class implementation{ 
//     public static void main(String[] args) {
        
//     }
// }