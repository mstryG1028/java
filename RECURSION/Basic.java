package RECURSION;

// def: recursion is fn calling itself
public class Basic {

    // static int sum(int sum, int arr[], int i) {
    //     while (i < arr.length) {
    //         sum(sum + arr[i], arr, i++);
    //     }
    //     return sum;
    // }
    // }
    static void increasing(int i) {
        if (i > 10) {
            return;
        }

        //yahan pe ye callstack store karta hai jo ki LIFO follow karta hai
        //jab base case aa jata hai to retrn hote time 
        //sabhi callstack ka value print kata hai
        //yahan pe hum fn ko pehle call kar rhe before print
        //isliye pehle callstack complte hoga usske baad up to down print hoga
        // increasing(i + 1); //op: 10-9-8-7-6-5-4-3-2-1
        // System.out.println(i);

        //WORKING
// increasing(1)
// increasing(2)
// ...
// increasing(11)
//  → return

// print 10
// ...
// print 2
// print 1

        System.out.println(i);//op: 1-2-3-4-5-6-7-8-9-10
        increasing(i + 1);

        //WORKING
        // print 1
        // increasing(2)
        // print2
        // increasing(3)
        // ...
        // print 10
        // increasing(11)
        // return

    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 4};
        increasing(1);
    }
}
