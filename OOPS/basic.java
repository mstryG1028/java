package OOPS;

// //NOTE: we can declare class in main fn also but its scope will be
// //only in main fn we cant acces outside of main fn
// public class basic {
//     //declaration of class which we can also call this user defined data type
//     // class ka name small me bhi de skate hai but acha lagne ke liye and best practice
//     public static class Student {
//         String name;
//          private int roll;
//         int age;
// final String scName="bss";
// final kw ka use hai- value ko change nhi kar sakte bas use kr sakte hai
//isme getter ka use karke value read kar sakte hai but
//  setter ka use karke set or change nhi kar sakte



// Constructor object creation ke time values initialize karne ke liye use hota hai
// Agar hum khud koi constructor banate hain, to Java default constructor provide nahi karta
// jiske wajah se s1.name="deepak"nhi kar sakte ye bhi access karne ke liye 
// Isliye default aur parameterized dono constructor chahiye ho,
// to hume default constructor manually define karna padta hai

// NOTE: agar hum def cons use karte hai to Student s1=new Student(); s1.name="ram"; valid 
//nhi to parameter dena padta hai
//conclusion: default cons are non parameterize another parameterized

//         Student(String name, int roll, int age) {
//             this.name = name;
//             this.roll = roll;
//             this.age = age;
//         }
//     }
//     public static class Car {
//         String color;
//         String name;
//         // Car() {  // itna kaam agar hum khud na kare to java auto kar deta hai
//         //     this.name = name;
//         //     this.color = color;
//         // }
//         //agar hame constrainst add karna hai to khud karna padta hai
//         // iski help se hm obj ka value at time of creaion de skte hai
//         Car(String name, String color) { 
//             this.name = name;
//             this.color = color;
//         }
//     }
//     public static void main(String[] args) {
//         //object creation
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter name:");
//         // String name = sc.nextLine();
//         Student s1 = new Student("deepak", 12, 1234);
//     }
// }


//POINT: classes are passed by ref
// means:we can change value of obj by using fn or dirctly
// public class basic{

//     //ye fn ek new a variable bnata hai jiska value usse main fn se mila hai
//     //phir ye sare oprn usi new var pe karta hai original value of a, change nhi hoga main fn me
//     //this is called pass by value
//     //NOTE: java me alwyas pass by value hi hota hai
//     //NOTE: but claas me pass by ref hota hai value changes
//     static int changeValue(int a){
//         // agar hum a ki value is fn me print kareye to 100 hoga
//         // hum aisa samjh sakte hai ki ye fn ek var x define kar rh ahai
//         // or x ki vaue main fn ke a se le rha hai bas
//         return a*10;
//     }
// public static void main(String[] args) {
//     int a=10;
//     System.out.println("before change:"+a);
//     changeValue(a);
//     System.out.println("after change:"+a);
// }
// }
//ACCESS MODIFIERS
// public- all pckages
// default- same pckages
// private- same class
// USE OF STATIC KW
// A static variable is not truly global, but it behaves like a global variable
//  within a class because it is shared by all objects of that class.

public class basic {
        private static int nOfStd;
    public static class Student {

        int roll;
        String name;

        //lekin static ke sath problem hai ki hum isse change kar sakte hai
//iske liye isko private static kar denge jisse bas aacess hoga

        public Student(int roll, String name) {
            this.roll = roll;
            this.name = name;
            nOfStd++;
        }

        public static int getNoOfStd() { //getter
            return nOfStd;
        }
       public static int changeNo(int x){
            return x+10;
        }
    }

    public static void main(String[] args) {

System.out.println(changeNo(20));
        // Student.nOfStd = 21;
        //private whithin root class accesible hai but directly 
        // yahan acces nhi kar sakte isliye getter bnaya hai
        // getter acces kar rh hai kyuki same root class hai
        Student s1 = new Student(21, "deepak");
        Student s2 = new Student(21, "deepak");
        //hum obj ko value same rakh sakte 
        // agr id ko unique bnana hai to validations lgana padega 
        //ex hashMap isContains() etc
        System.out.println(Student.getNoOfStd());
        
    }

}
