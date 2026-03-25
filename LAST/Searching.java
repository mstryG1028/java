// package LAST;

// public class Searching {
//     static void printArr(int arr[]) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }

//     static int binarySearch(int arr[], int target) { // 0(logn)
//         int st = 0;
//         int end = arr.length - 1;
//         while (st <= end) {

//             // int mid =(st+end)/2; why this is not used explained below
//             int mid = st + (end - st) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             } else if (arr[mid] < target) {
//                 st = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     static int SearchingRotatedSoretdArr(int arr[], int target) {
//         int st = 0;
//         int end = arr.length - 1;
//         while (st <= end) {
//             int mid = st + (end - st) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             }
//             if (arr[st] <= arr[mid]) { // left Sorted
//                 if (arr[st] <= target && target < arr[end]) {
//                     end = mid - 1;
//                 } else {
//                     st = mid + 1;
//                 }
//             } else {
//                 if (arr[mid] < target && target <= arr[end]) {
//                     st = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }

//         }
//         return -1;
//     }
//     // static boolean binarySearchFor2d(int arr[], int target) { // 0(logn)
//     // int st = 0;
//     // int end = arr.length - 1;
//     // while (st <= end) {

//     // // int mid =(st+end)/2; why this is not used explained below
//     // int mid = st + (end - st) / 2;
//     // if (arr[mid] == target) {
//     // return true;
//     // } else if (arr[mid] < target) {
//     // st = mid + 1;
//     // } else {
//     // end = mid - 1;
//     // }
//     // }
//     // return false;
//     // }
//     // static boolean searchInSorted2dArr(int arr[][], int target) { // total= TC
//     // 0(n log m)
//     // int m = arr[0].length-1;
//     // for (int i = 0; i < arr.length; i++) { // for searching each row 0(n)
//     // if (arr[i][0] <= target && target <= arr[i][m]) {
//     // return binarySearchFor2d(arr[i], target); // for binary search 0(log n)
//     // }
//     // }
//     // return false;
//     // }

//     // -----------------EFFICIENT WAY-------------------

//     static boolean searchInSorted2drr(int arr[][], int target) { // TC 0(log(n*m))
//         int n = arr.length, m = arr[0].length;
//         int low = 0, high = n * m - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int row = mid / m, col = mid % m; // imp formula for finding row and col from mid
//             if (arr[row][col] == target) {
//                 return true;
//             } else if (arr[row][col] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return false;
//     }

//     static int[] FirstAndLastOccurence(int arr[], int target) {
//         int ans = binarySearch(arr, target);
//         int ansArr[] = { -1, -1 };
//         if (ans < 0)
//             return ansArr;
//         int j = ans;
//         int k = ans;

//         while (j - 1 >= 0 && (arr[j - 1] == target)) {
//             j--;
//         }

//         while (k + 1 < arr.length && (arr[k + 1] == target)) {
//             k++;
//         }
//         ansArr[0] = j;
//         ansArr[1] = k;

//         printArr(ansArr);
//         return ansArr;
//     }

//     public static void main(String[] args) {
//         int arr[][] = {
//                 { 1, 2, 3 },
//                 { 4, 5, 6 },
//                 { 7, 8, 9 }
//         };
//         System.out.println(searchInSorted2drr(arr, 40));
//     }
// }

// /*
//  * index: 0 1 2 3 4 5 6 7 8 9
//  * arr: 2 4 6 8 10 12 14 16 18 20
//  *
//  * Case 1
//  * int mid = (st + end) / 2;
//  *
//  * st = 6 , end = 9
//  *
//  * mid = (6 + 9) / 2
//  * mid = 15 / 2
//  * mid = 7.5 ~ 7
//  *
//  * so it will check arr[7] which is 16
//  * This is correct.
//  *
//  *
//  * 
//  * * ----------------------------------------------------
//  * Where (st + end) / 2 fails
//  * ----------------------------------------------------
//  *
//  * Suppose indexes are very large (near Integer limit)
//  *
//  * st = 2000000000
//  * end = 2100000000
//  *
//  * mid = (st + end) / 2
//  *
//  * mid = (2000000000 + 2100000000)
//  * mid = 4100000000
//  *
//  * But Java int max value = 2147483647
//  *
//  * So 4100000000 exceeds the int limit → integer overflow happens
//  *
//  * Result → mid becomes negative or incorrect value
//  * Binary search will check a wrong index and may crash.
//  * ----------------------------------------------------
//  * -----------------------------------------------------
//  * Case 2 (Safe formula)
//  * int mid = st + (end - st) / 2;
//  *
//  * st = 6 , end = 9
//  *
//  * mid = 6 + (9 - 6) / 2
//  * mid = 6 + 3 / 2
//  * mid = 6 + 1.5
//  * mid = 7.5 ~ 7
//  *
//  * so it will check arr[7] which is 16
//  * Also correct.
//  *
//  * ----------------------------------------------------
//  * Safe formula avoids this
//  * ----------------------------------------------------
//  *
//  * int mid = st + (end - st) / 2;
//  *
//  * st = 2000000000
//  * end = 2100000000
//  *
//  * mid = 2000000000 + (2100000000 - 2000000000) / 2
//  * mid = 2000000000 + 100000000 / 2
//  * mid = 2000000000 + 50000000
//  * mid = 2050000000
//  *
//  * No overflow happens.
//  */

