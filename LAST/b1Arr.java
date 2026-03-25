package LAST;

import java.util.*;

public class b1Arr {

    // _______________________ARRAY__________________________

    static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    // REVERSE OF AN ARRAY

    // static void reverseArr(int arr[]) { //TC 0(n) SC 0(1)
    // int s = 0;
    // int e = arr.length - 1;
    // while (s < e) {
    // int temp = arr[s];
    // arr[s] = arr[e];
    // arr[e] = temp;
    // s++;
    // e--;
    // }
    // for (int n : arr) {
    // System.out.print(n + " ");
    // }
    // }

    // USING RECURSION
    // static void reverseArr(int arr[], int s, int e) { //TC 0(n) SC 0(n)

    // if (s >= e) {
    // printArr(arr);
    // return;
    // }

    // int temp = arr[s];
    // arr[s] = arr[e];
    // arr[e] = temp;
    // reverseArr(arr, s + 1, e - 1);

    // }

    // SECOND LARGEST OF AN ARRAY

    static int secondLargest(int arr[]) { // 0(n) 0(1)
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        return (second == Integer.MIN_VALUE) ? 1 : second;
    }

    // static int findMissingNO(int arr[]) {
    // // n*(n+1)/2 It works when the array contains numbers from 1 to n (or 0 to n)
    // // without gaps.

    // int n = arr.length + 1;
    // int expectedSum = n * (n + 1) / 2;
    // int arrSum = 0;
    // for (int i : arr) {
    // arrSum += i;
    // }
    // return expectedSum - arrSum;
    // }

    // static int findMissingNO(int arr[]) {
    // int n = arr.length + 1;
    // int xor = 0;
    // int xor1 = 0;
    // for (int i = 1; i <= n; i++) {
    // xor ^= i;
    // }
    // // this gives actually xor= 1 ^ 2 ^ 3 ^ 4 ^ 5 but internally its value will
    // be 1
    // for (int num : arr) {
    // xor1 ^= num;
    // }
    // // this gives actually xor1 = 1 ^ 2 ^ 3 ^ 5 but internally its value will be
    // // xor1 = 5
    // return xor ^ xor1;
    // // return xor1-xor;// we can also write this
    // }

    // static void moveAllZeroToEnd(int arr[]) { // 0(n) 0(1)
    // int curr = 0;
    // int i = 0;
    // while (i < arr.length) {
    // if (arr[i] != 0) {
    // int temp = arr[curr];
    // arr[curr] = arr[i];
    // arr[i] = temp;
    // curr++;
    // }
    // i++;

    // }
    // printArr(arr);
    // }
    static void moveAllZeroTend(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            if (arr[s] == 0) {
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                e--;
            } else {
                s++;
            }
        }
        printArr(arr);
    }

    static void rotate(int arr[], int s, int e) { // 0(n) 0(1)
        // 3 for loop lga ke bhi kar sakte hai traditional method 0(n*k) 0(1)
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    static void rotateByK(int arr[], int k) {
        rotate(arr, 0, arr.length - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, arr.length - 1);
        printArr(arr);
    }

    // static int[] twoSum(int arr[], int k) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // int ans[] = { -1, -1 };
    // for (int i = 0; i < arr.length; i++) {
    // if (map.containsKey(k - arr[i])) {
    // ans = new int[] { i, map.get(k - arr[i]) };
    // printArr(ans);
    // return ans;
    // } else {
    // map.put(arr[i], i);
    // }
    // }
    // printArr(ans);
    // return ans;
    // }

    // static int maxSubArrSum(int arr[]) { // 0(n) 0(1)

    // int e = 0;
    // int maxSum = Integer.MIN_VALUE;
    // int currSum = 0;
    // for (e = 0; e < arr.length; e++) {
    // currSum += arr[e];
    // if (currSum > maxSum) {
    // maxSum = currSum;

    // } else if (currSum <= 0) { // yahan pe problem hai koi arr me -ve no bhi
    // sabse bda ho sakta hai
    // currSum = 0;
    // }
    // }

    // return maxSum;

    // }

    }
    // --------------OR LESS CODE------------

    // static int maxSubArrSum(int arr[]) {

    // int maxSum = arr[0];
    // int currSum = arr[0];

    // for (int i = 1; i < arr.length; i++) {

    // // decide start new subarray or continue
    // currSum = Math.max(arr[i], currSum + arr[i]);

    // // update global maximum
    // maxSum = Math.max(maxSum, currSum);
    // }

    // return maxSum;
    // }

    static void allDuplicateInArr(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (map.containsKey(arr[i])) {
        // map.put(arr[i], map.get(arr[i]) + 1);

        // } else {
        // map.put(arr[i], 1);
        // }
        // }
        // ---------------------OR------------
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int size = 0;
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                size++;
            }
        }
        int ans[] = new int[size];
        int i = 0;
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                ans[i++] = n;
            }
        }
        printArr(ans);

    }

    static int majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFreq = 0;
        int ans = 0;
        for (int n : map.keySet()) {
            if ((map.get(n)) > maxFreq) {
                maxFreq = map.get(n);
                ans = n;
            }
        }
        return ans;
    }

    static void sort0_1_2(int arr[]) {
        int s = 0;
        int m = 0;
        int e = arr.length - 1;
        while (m <= e) {
            if (arr[m] == 0) {
                int temp = arr[s];
                arr[s] = arr[m];
                arr[m] = temp;
                s++;
                m++;
            } else if (arr[m] == 1) {
                m++;
            } else {
                int temp = arr[m];
                arr[m] = arr[e];
                arr[e] = temp;
                e--;
            }
        }

    }
    /*
     * =========================================
     * BEST TIME TO BUY AND SELL STOCK
     * =========================================
     * 
     * Logic:
     * s -> buying day
     * e -> selling day
     * 
     * If price[e] < price[s]
     * move buying day to e
     * Else
     * calculate profit
     * 
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     */

    static int bestTimeToBuySellStock(int arr[]) {
        int maxProfit = 0;
        int s = 0;
        int e = s + 1;
        while (e < arr.length) {
            if (arr[e] > arr[s]) {
                int currProfit = arr[e] - arr[s];
                maxProfit = Math.max(maxProfit, currProfit);
            } else {
                s = e;
            }
            e++;
        }
        return maxProfit;
    }

    // ----------MAXPRODUCT--------------
    static void generateAllSubArr(int arr[]) {
        int maxProd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("{ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(" }");
            }
            System.out.println();
        }
    }

    static int MaxProdByGenerateAllSubArr(int arr[]) {
        int maxProd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currProduct = 1;
                for (int k = i; k <= j; k++) {
                    currProduct = currProduct * arr[k];
                }
                maxProd = Math.max(currProduct, maxProd);

            }

        }
        return maxProd;
    }

    // static int maxProductSubb(int arr[]) {
    // int max = arr[0];
    // int min = arr[0];
    // int ans = arr[0];

    // for (int i = 1; i < arr.length; i++) {

    // if (arr[i] < 0) {
    // int temp = max;
    // max = min;
    // min = temp;
    // }

    // max = Math.max(arr[i], max * arr[i]);
    // min = Math.min(arr[i], min * arr[i]);

    // ans = Math.max(ans, max);
    // }

    // return ans;
    // }

    // -----------------TRAPPING RAIN WATER---------------

    // static int maxWater(int arr[]) {
    // int ans = Integer.MIN_VALUE;
    // int i = 0;
    // int j = arr.length - 1;
    // while (i < j) {
    // int l = j - i;
    // int b = Math.min(arr[i], arr[j]);

    // int area = l * b;
    // ans = Math.max(ans, area);
    // if (arr[i] < arr[j]) {
    // i++;
    // } else {
    // j--;
    // }
    // }
    // return ans;
    // }

    static void generateAllTriplet(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {
                    System.out.print("{ ");
                    System.out.print(arr[i] + " " + arr[j] + " " + arr[k] + " ");
                    System.out.print(" }");
                }

                System.out.println();
            }
            System.out.println();
        }
    }

    static int findAllZerobyGenerateAllTriplet(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0)
                        count++;
                }

            }

        }
        return count;
    }

    static int allTrpletWithSumZero(int arr[]) {
        int count = 0;
        int i = 0;
        while (i < arr.length - 2) {
            int j = i + 1, k = j + 1;
            System.out.println("{ " + arr[i] + " " + arr[j] + " " + arr[k] + "}");
            i++;
        }
        return count;

    }

    // -------------FIND OCCURENCE OF TARGET------------

    // using normal loop
    // HASHMAP SE BHI KAR SAKTE HAI
    static int findOccurence(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    // USING BINARY SEARCH
    // HERE WE ARE FIRST FINDING THE FIRST OCCURENCE THEN LAST OCCURENCE THEN
    // COUNT FROM FIRST TO LAST

    // Find first occurrence
    static int firstOccurrence(int arr[], int target) {
        int s = 0, e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            // arr = {1, 2, 2, 2, 3, 4}
            // target = 2
            if (arr[mid] == target) {
                ans = mid;
                e = mid - 1; // search on left side
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    // Find last occurrence
    static int lastOccurrence(int arr[], int target) {
        int s = 0, e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1; // search on right side
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    // Count occurrences
    static int findOccurrence(int arr[], int target) {

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first == -1)
            return 0;

        return last - first + 1;
    }

    // static void mergeSortedArr(int arr1[], int arr2[]) {
    // int i = 0, j = 0;
    // while (i < arr1.length && j < arr2.length) {
    // if (arr2[j] > arr1[i] && arr2[j] < arr1[i + 1]) {
    // int temp = arr1[i + 1];
    // arr1[i + 1] = arr2[j];
    // if (temp < arr2[j + 1]) {
    // arr2[j] = temp;
    // } else {
    // int p = j;
    // while (!(temp >= arr2[j])) {

    // p++;
    // }
    // int temp2 = arr2[j];
    // arr2[p] = temp;
    // arr2[j] = temp2;

    // }
    // i++;
    // }

    // }
    // }

    // using swap and sort method
    static void merge(int arr1[], int arr2[]) {

        int i = arr1.length - 1;
        int j = 0;

        while (i >= 0 && j < arr2.length) {

            if (arr1[i] > arr2[j]) {

                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;

                i--;
                j++;
            } else {
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    static int allSubArrSumequalToK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // this is for if arr[i]==k
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 0, 2, 0, 4, 0, 3, 0 };

    }
}
