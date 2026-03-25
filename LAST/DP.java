package LAST;

import java.util.Arrays;

/*
Climbing Stairs

0/1 Knapsack

Subset Sum

Longest Common Subsequence

Fibonacci (basic DP)
*/
class DP {
    static int t[][] = new int[102][1002];

    // Static block to initialize array
    static {
        for (int i = 0; i < 102; i++) {
            for (int j = 0; j < 1002; j++) {
                t[i][j] = -1;
            }
        }
    }

    static int knapsack(int wt[], int val[], int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (t[n][w] != -1) {
            return t[n][w];
        }
        if (wt[n - 1] <= w) {
            return Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1), knapsack(wt, val, w, n - 1));
        } else {

            t[n][w] = knapsack(wt, val, w, n - 1);
        }
        return t[n][w];
    }
    /*
     * ===========================================
     * Problem: Climbing Stairs
     * -------------------------------------------
     * Input: n = 5
     * Output: 8
     * ===========================================
     */

    static int climbingStairs(int n) {

        // Base cases
        if (n == 0 || n == 1)
            return 1;

        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        /*
         * dp[i] = ways to reach step i
         */
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    class ClimbingStairs {

        static int climb(int n) {

            if (n == 0 || n == 1)
                return 1;

            int prev1 = 1; // dp[i-1]
            int prev2 = 1; // dp[i-2]

            for (int i = 2; i <= n; i++) {
                int curr = prev1 + prev2;
                prev2 = prev1;
                prev1 = curr;
            }

            return prev1;
        }
    }

    // by using extra space
    // static int fib(int n) {
    // int F[] = new int[n + 1]; // array needed here
    // F[0] = 0;
    // F[1] = 1;

    // for (int i = 2; i <= n; i++) {
    // F[i] = F[i - 1] + F[i - 2];
    // }

    // return F[n];
    // }

    // --------------------------OR-------------
    // withoout extra space
    static int fib(int n) {
        if (n <= 1)
            return n;

        int prev2 = 0; // F[i-2]
        int prev1 = 1; // F[i-1]

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    // static int[][] dp;

    static int longestCommonSubSeq(int i, int j, String s1, String s2) {
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {// this line is just for memorization
            // since in recursion some calls are repated so to overcome this we use
            // memorization
            return dp[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + longestCommonSubSeq(i + 1, j + 1, s1, s2);
        }
        return dp[i][j] = Math.max(
                longestCommonSubSeq(i + 1, j, s1, s2),
                longestCommonSubSeq(i, j + 1, s1, s2));
    }

    static int[][] dp;

    static int countSubsets(int index, int arr[], int target, int sum) {

        if (sum == target)
            return 1;
        if (index == arr.length || sum > target)
            return 0;

        if (dp[index][sum] != -1) {
            return dp[index][sum];
        }

        int include = countSubsets(index + 1, arr, target, sum + arr[index]);
        int exclude = countSubsets(index + 1, arr, target, sum);

        return dp[index][sum] = include + exclude;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int target = 5;

        dp = new int[arr.length][target + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println("Count: " + countSubsets(0, arr, target, 0));
    }
}
