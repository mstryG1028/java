package Basic;

public class H {

    static int revNo(int n) {
        int ans = 0;
        while (n > 0) {

            ans = ans * 10 + n % 10;
            n = n / 10;
        }
        return ans;
    }

    static String isPrime(int n) {
        if (n <= 1) {
            return "not prime";
        }

        for (int i = 2; i <= Math.sqrt(n); i++) { // math.sqrt(n) returns double
            if (n % i == 0) {
                return "not prime";
            }
        }
        // how it works
        //ex 36 Math.sqrt(n) =6  
        return "prime";
    }

    static void fibonacci(int range) {
        int i = 1;
        int a = 0, b = 1;
        while (i <= range) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
    }

    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    static void sumOfdigit(int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }

    //2nd largest in arr
    static int largest(int arr[]) {
        int first = 0, second = 0;
        for (int n : arr) {
            if (n > first) {
                first = n;
                second = first;
            }else if(n>second&& n<first) {
                second=n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 7, 8, 3};
        System.out.println(largest(arr));
    }
}
