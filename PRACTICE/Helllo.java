package PRACTICE;

public class Helllo {
    static int specialPair(int arr[]) { // 0(N^2)
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % 3 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
     * when we add rem of 2 no if it is 3 then sum both no wil be divible by 3
     */
    static void pairs(int arr[]) { // 0(N)
        int count0 = 0, count1 = 0, count2 = 0;
        /*
         * Here count0 =1 for(3), count1 = 2 for(1,4), count2= 2 for(2,5);
         * now how many pairs can be make using (1,4)and (2,5) and every pair will be
         * divisible by 3
         * 
         * Another Example: {1,2,3,4,5,6,7}, divisible by 3
         * 
         * Group by remainder modulo 3:
         * count0 → divisible by 3 → {3,6} → 2 numbers
         * count1 → remainder 1 → {1,4,7} → 3 numbers
         * count2 → remainder 2 → {2,5} → 2 numbers
         * Calculate pairs:
         * (0,0) → pick 2 numbers from divisible by 3 → C(2,2) = 1 → pair (3,6)
         * (1,2) → multiply count1 * count2 → 3 * 2 = 6 pairs → pairs:
         * (1,2),(1,5),(4,2),(4,5),(7,2),(7,5)
         * ✅ Total valid pairs = 1 + 6 = 7 pairs
         * 
         */

        // Count numbers by remainder
        for (int num : arr) {
            if (num % 3 == 0)
                count0++;
            else if (num % 3 == 1)
                count1++;
            else
                count2++;
        }

        // Count valid pairs
        int pairs = (count0 * (count0 - 1) / 2) + (count1 * count2);
        System.out.println("Number of special pairs: " + pairs);
    }

    static int maxsubArr(int arr[]) {
        int maxSum = 0;
        int currMax = 0;
       
        int j = 0;
        while (j < arr.length) {
            currMax = Math.max(currMax + arr[j], arr[j]);
            if (currMax > maxSum) {
                maxSum = currMax;

            }
            j++;

        }

        return maxSum;

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter size of an array:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("enter values:");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println(specialPair(arr));
        int arr[] = { 1, -2, 0, 3, -1 };
        System.out.println(maxsubArr(arr));
    }
}