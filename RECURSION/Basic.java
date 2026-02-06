package RECURSION;

// // def: recursion is fn calling itself
public class Basic {

//     // static int sum(int sum, int arr[], int i) {
//     //     while (i < arr.length) {
//     //         sum(sum + arr[i], arr, i++);
//     //     }
//     //     return sum;
//     // }
//     // }
//     static void increasing(int i) {
//         if (i > 10) {
//             return;
//         }
//         //yahan pe ye callstack store karta hai jo ki LIFO follow karta hai
//         //jab base case aa jata hai to retrn hote time 
//         //sabhi callstack ka value print kata hai
//         //yahan pe hum fn ko pehle call kar rhe before print
//         //isliye pehle callstack complte hoga usske baad up to down print hoga
//         // increasing(i + 1); //op: 10-9-8-7-6-5-4-3-2-1
//         // System.out.println(i);
//         //WORKING
// // increasing(1)
// // increasing(2)
// // ...
// // increasing(11)
// //  → return
// // print 10
// // ...
// // print 2
// // print 1
//         System.out.println(i);//op: 1-2-3-4-5-6-7-8-9-10
//         increasing(i + 1);
//         //WORKING
//         // print 1
//         // increasing(2)
//         // print2
//         // increasing(3)
//         // ...
//         // print 10
//         // increasing(11)
//         // return
//     }
// sum of number
    static int sumOfNum(int x) {
        if (x == 0) {
            return 0;
        }
        int sum = 0;
        sum = sum + x % 10 + sumOfNum(x / 10);

        return sum;
    }

    // factorial of number
    static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        int fact = x * factorial(x - 1);

        return fact;
    }

//rev of number
    // static int reverse(int x) {
    //     int rev = 0;
    //     while (x > 0) {
    //         int rem = x % 10;
    //         rev = rev * 10 + rem;
    //         x = x / 10;
    //     }
    //     return rev;
    // }
    // using rec and static var
    // static int rev = 0;
    // static int reverse(int x) {
    //     if (x == 0) {
    //         return rev;
    //     }
    //     rev = rev * 10 + x % 10;
    //     return reverse(x / 10);
    // }


    //count digit of num using recur and static var
    static int count = 0;
    static int countDigit(int x) {
        if (x == 0) {
            return count;
        }
        count++;
        return countDigit(x / 10);
    }

    // fibonacci series
    static void fibonacci(int range,int a,int b,int c){
         if(range==0)return;
            System.out.println(c);
        fibonacci(--range,b,c,b+c); // yahan post decrement use nhi kar sakte bcz range
        //  pehle hi assign ho rha hai baad me reduce ho rha hai 
        // iske wajah se same value of range aa rha hai baar baar
//NOTE: always avoid --, ++ in recursion
     
    }

    public static void main(String[] args) {
        // System.out.println(countDigit(1234));
        fibonacci(10, 0, 1, 1);
    }
}
