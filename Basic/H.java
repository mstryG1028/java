package Basic;

class bheem extends Thread {// thread 1
    public void run() {
        for (int b = 0; b < 10; b++) {
            System.out.println("bheem-->" + b);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Motu extends Thread {  // thread 2
    public void run() {
        for (int b = 0; b < 10; b++) {
            System.out.println("Motu-->" + b);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Doraemon extends Thread {  // thread 3
    public void run() {
        for (int b = 0; b < 10; b++) {
            System.out.println("Doraemon-->" + b);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Sinchan extends Thread {  // thread 4
    public void run() {
        for (int b = 0; b < 10; b++) {
            System.out.println("sinchan-->" + b);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class H {
    public static void main(String[] args) {// main is also called as a thred which runs every time
        System.out.println("-----------Main start------------");
        bheem b1 = new bheem();
        b1.start();
        Motu m1 = new Motu();
        m1.start();
        Sinchan s1 = new Sinchan();
        s1.start();
        Doraemon d1 = new Doraemon();
        d1.start();

        System.out.println("-----------Main End-------------");
        // order kisi ka fix nhi hota ye dekhta hai ki curr thred me koi load aa rha hai ki nhi
        //agar aa rha hai to ye thread ko switch kar deta hai
        // dono print statements pehle hi print ho gya kyuinki print me jyada load nhi hota hai

        // imp methods present in thread class and its uses
    }
}

// public class H {

// static int revNo(int n) {
// int ans = 0;
// while (n > 0) {

// ans = ans * 10 + n % 10;
// n = n / 10;
// }
// return ans;
// }

// static String isPrime(int n) {
// if (n <= 1) {
// return "not prime";
// }

// for (int i = 2; i <= Math.sqrt(n); i++) { // math.sqrt(n) returns double
// if (n % i == 0) {
// return "not prime";
// }
// }
// // how it works
// //ex 36 Math.sqrt(n) =6
// return "prime";
// }

// static void fibonacci(int range) {
// int i = 1;
// int a = 0, b = 1;
// while (i <= range) {
// System.out.print(a + " ");
// int c = a + b;
// a = b;
// b = c;
// i++;
// }
// }

// static int countDigit(int n) {
// int count = 0;
// while (n > 0) {
// n /= 10;
// count++;
// }
// return count;
// }

// static void sumOfdigit(int num) {

// int sum = 0;

// while (num > 0) {
// sum += num % 10;
// num /= 10;
// }
// System.out.println(sum);
// }

// //2nd largest in arr
// static int largest(int arr[]) {
// int first = 0, second = 0;
// for (int n : arr) {
// if (n > first) {
// first = n;
// second = first;
// }else if(n>second&& n<first) {
// second=n;
// }
// }
// return second;
// }

// public static void main(String[] args) {
// int arr[] = {5, 2, 7, 8, 3};
// System.out.println(largest(arr));
// }
// }
