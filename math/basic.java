
public class basic {

// sqrt of any number
    // static int sqrt(int x) {
    //     int ans = -1;
    //     for (int i = 0; i <= x; i++) {
    //         long sq = (long) i * i;  // this is used for larger value
    //         if (sq <= x) {
    //             ans = i;
    //         } else {
    //             return i - 1;
    //         }
    //     }
    //     return ans;
    // }
    static int sqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x <= 3) {
            return 1;
        }
        int ans = 1;
        int small = 1;
        int large = x / 2;

        while (small <= large) {
            int mid = (small + large) / 2;
            if ((long) mid * mid > x) {
                large = mid - 1;
            } else {
                ans = mid;
                small = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 34;
        System.out.println(sqrt(x));
    }
}
