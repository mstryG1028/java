
import java.util.*;

public class basic {

    static void printArr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    // static void bubbleSort(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[j] < arr[i]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     printArr(arr);
    // }
    static void rotateArr(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // printArr(arr);
    }

    // static void rotateK(int arr[], int k) {
    //     rotateArr(arr, 0, arr.length - 1);
    //     rotateArr(arr, 0, k - 1);
    //     rotateArr(arr, k, arr.length - 1);
    //     printArr(arr);
    // }
    //  // with extra Space
    // static void rotateK(int arr[], int k) {
    //     int n = arr.length;
    //     int ans[] = new int[n];
    //     int p = 0;
    //     for (int i = n - k; i < arr.length; i++) {
    //         ans[p] = arr[i];
    //         p++;
    //     }
    //     for (int i = 0; i <= n - k - 1; i++) {
    //         ans[p] = arr[i];
    //         p++;
    //     }
    //     printArr(ans);
    // }
    // public int maxProfit(int[] prices) {
    //     int minPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;
    //     for (int price : prices) {
    //         // If we find a lower price, update minPrice
    //         if (price < minPrice) {
    //             minPrice = price;
    //         }
    //         // Calculate profit if we sell at current price
    //         int profit = price - minPrice;
    //         // Update max profit if this profit is higher
    //         if (profit > maxProfit) {
    //             maxProfit = profit;
    //         }
    //     }
    //     return maxProfit;
    // }
//ROMAN TO INTEGER
    // static int romnToInteger(String s) {
    //     HashMap<Character, Integer> map = new HashMap<>();
    //     map.put('I', 1);
    //     map.put('V', 5);
    //     map.put('X', 10);
    //     map.put('L', 50);
    //     map.put('C', 100);
    //     map.put('D', 500);
    //     map.put('M', 1000);
    //     int result = map.get(s.charAt(s.length() - 1));
    //     for (int i = s.length() - 2; i >= 0; i--) {
    //         if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
    //             result = result - map.get(s.charAt(i));
    //         } else {
    //             result = result + map.get(s.charAt(i));
    //         }
    //     }
    //     return result;
    // }
    //LENGTH OF LAST WORD
    // static int lengthOfLAstWord(String s) {
    //     int count = 0;
    //     int i = s.length() - 1;
    //     while (i >= 0) {
    //         if (s.charAt(i) == ' ') {
    //             if (count == 0) {
    //                 i--;
    //             } else {
    //                 break;
    //             }
    //         }else{
    //             count++;
    //             i--;
    //         }
    //     }
    //     return count;
    // }
    // brute force
    // static String longestCommonPref(String arr[]) {
    //     if (arr == null || arr.length == 0) return "";
    //     String ans = "";
    //     for (int j = 0; j < arr[0].length(); j++) {
    //         int i = 0;
    //         while (i < arr.length-1) {
    //             if (arr[i].charAt(j) == arr[i + 1].charAt(j)) {
    //                 i++;
    //             } else {
    //                 return ans;
    //             }
    //         }
    //         ans = ans + arr[i].charAt(j);
    //     }
    //     return ans;
    // }
//    // eff way by sorting and just checking 1st and last word
    // static String longestCommonPref(String arr[]) {
    //     if (arr == null || arr.length == 0) {
    //         return "";
    //     }
    //     String ans = "";
    //     Arrays.sort(arr);
    //     printArr(arr);
    //     int j = 0;
    //     if(arr[0].length()<=1){
    //         return ans;
    //     }
    //     while (arr[0].charAt(j) == arr[arr.length - 1].charAt(j)) {
    //         ans = ans + arr[0].charAt(j);
    //         j++;
    //     }
    //     return ans;
    // }
    // static boolean isSubsequence(String s, String t) {
    //       if (s == null || t == null) return false;
    //     int i=0;int j=0;
    //     while(i<s.length()&&j<t.length()){
    //         if(s.charAt(i)==t.charAt(j)){
    //             i++;
    //         }
    //         j++;
    //     }
    //     return i==s.length();
    // }
    void sumDivisibleByK(int k, int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % k == 0) {
                sum = sum + e.getKey() * e.getValue();
            }
        }
    }

    public static void main(String[] args) {
        int arrs[] = {7, 1, 5, 3, 6, 4};
        // System.out.println(" hello");
        // System.out.println(arr.length);
        // bubbleSort(arr);
        // mergeSort(arr);
        // rotateArr(arr);
        // rotateK(arr, 3);
        // System.out.println(maxProfit(arr));
        // String s = "LVIII";
        // System.out.println(romnToInteger(s));
        // String s = " fly    ";
        // System.out.println(s.length());
        // System.out.println(lengthOfLAstWord(s));
        // String arr[] = {""};
        // System.out.println(longestCommonPref(arr));

        String arr[] = {"flowers", "flow", "flight"};
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
