package LAST;

public class Maths {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        // for (int i = 3; i <= Math.sqrt(n); i++) {
        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void primeInRange(int n) {
        // for (int i = 2; i <= n; i++) {// can be optimized using
        for (int i = 3; i <= n; i++) {// this wont check even no ex 2,4,6
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static void gcdAndLcm(int a, int b) {
        int small = Math.min(a, b);
        int gcd = 1;
        for (int i = small; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                // gcd = Math.min(gcd, i);
                // aisa likhe to wrong aa jaayega gcd means jo bhi pehla no from small to 2 a
                // and b ko divide kar jaaye wo gcd hoga
                gcd = i; // 10; for 10,20
                break;
            }
        }
        int lcm = (a * b) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    static int gcd(int a, int b) { // the basic idea is make anyone zero then other will be gcd
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            if (b > a)
                b = b % a;
        }
        if (a == 0)
            return b;
        return a;
    }

    static void gcdByEuclid(int a, int b) {
        int x = a;
        int y = b;
        int gcd = 1;
        // gcd(a,b)=gcd(large-small,small)
        // gcd(10,20)= gcd(10,10)= gcd(0,10)
        // when any one will 0 then other will be gcd

        // which is similarly equal to gcd(a%b,b):
        // the idea is gcd(a,b)= gcd(a%b,b);

        // use (10,20 to understand)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        gcd = a;

        System.out.println(gcd);

        // since lcm*gcd=a*b;
        // int lcm=(a*b)/gcd; // this is wrong bcz now b=0;
        int lcm = (x * y) / gcd;
        System.out.println(lcm);

    }

    static boolean isArmstrong(int n) {
        int size = 0;
        int temp = n;
        while (temp > 0) {
            size++;
            temp = temp / 10;
        }
        int ans = 0;
        temp = n;
        while (n > 0) {
            int rem = n % 10;
            ans = ans + (int) Math.pow(rem, size);
            n = n / 10;
        }
        return (temp == ans);
    }

    static int findFactorial(int n) {

        if (n == 0)
            return 1;

        return n * findFactorial(n - 1);
    }

    static void fibonacci(int n) {
        int a = 0;
        int b = 1;

        while (n > 0) {

            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

            n--;
        }

    }

    static void fibonacciInrange(int start, int end) {
        int a = 0;
        int b = 1;
        while (a <= end) {
            if (a > start) {
                System.out.print(a + " ");
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }

    static void fibonacciUptoN(int n, int a, int b) {

        if (n == 0)
            return;

        System.out.print(a + " ");
        fibonacciUptoN(n - 1, b, a + b);
    }

    static int revDigit(int n) {
        int ans = 0;

        // these 2 lines for handling -ve no also
        int sign = n < 0 ? -1 : 1;
        // n = Math.abs(n);
        // -----OR-----
        n = n * (-1);
        while (n > 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        return ans * sign;
    }

    static boolean isPerfectNo(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    static int power(int x, int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }
        return ans;
    }

    static int powerByRec(int x, int n) { // 0(n)
        int ans = 1;
        if (n == 0) {
            return ans;
        }
        return x * power(x, n - 1);
    }

    static int powerFast(int x, int n) { // best 0(log n)

        if (n == 0)
            return 1;

        int half = powerFast(x, n / 2);

        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
    }

    static void countSumProductOfDigit(int n) {
        if (n == 0) { // edge case
            System.out.println("Sum: 0 Product: 0 Count: 1");
            return;
        }
        int sum = 0, product = 1, count = 0;
        while (n > 0) {
            count++;
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;
        }
        System.out.println("sum: " + sum + " Product: " + product + " count is:" + count);
    }

    public static void main(String[] args) {
        System.out.println(powerByRec(2, 10));
        countSumProductOfDigit(23);
    }
}
