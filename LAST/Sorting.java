package LAST;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Sorting {

    static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // selection sort me hum first index ko select karte hai and arr me jo
    // bhi value sabse chhota hai usko first index pe rakh dete hai
    // ex [5,9,7,1,2] i=0 smallest =1 arr[i]= 1

    static int[] selectionSort(int arr[]) { // 0(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);
        return arr;
    }

    static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pivotIdx = partition(arr, start, end);
            quickSort(arr, start, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, end);
        }
    }

    static int partition(int arr[], int start, int end) {
        int i = start - 1;
        int pivot = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {// this is for ascending order
                // if(arr[j]>=pivot){ // this is for descending
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; // this is for placing pivot at correct positn
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    // isme hum har baar value ko compare karte karte uske right position pe rakh
    // dete hai
    static int[] bubbleSort(int arr[]) { // 0(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);
        return arr;
    }

    static int[] insertionSort(int arr[]) { // 0(n^2)
        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
        printArr(arr);
        return arr;
    }

    static void merge(int arr[], int s, int m, int e) {

        int temp[] = new int[e - s + 1];
        int i = s, j = m + 1;
        int k = 0;
        while (i <= m && j <= e) {
            if (arr[j] <= arr[i]) {
                temp[k] = arr[j];
                k++;
                j++;
            } else {
                temp[k] = arr[i];
                i++;
                k++;
            }
        }
        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int idx = 0; idx < temp.length; idx++) {
            arr[idx + s] = temp[idx];
        }

    }

    static void mergeSort(int arr[], int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid); // first sorted part
            mergeSort(arr, mid + 1, end);// second sorted part
            merge(arr, start, mid, end); // merging both sorted arr
        }

    }

    static int kthLargestElement(int arr[], int k) {
        Arrays.sort(arr);

        return arr[arr.length - k];
    }

    // instead of using all elements of arr it will store only k largest element
    // at last it will return last value which is kth largest
    static int kthLargest(int arr[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {

            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }

        }
        System.out.println(pq);
        return pq.peek();
    }
    /*
     * How it works
     * consider arr[7, 10, 4, 3, 20, 15 ]
     * first element 7 it insert and it will check weather size is exceeds or not if
     * not then next elements insert
     * at 3 pq will not [7, 10, 4, 3] it will [3,4,7,10] bcz pq stores data in
     * sorted desc order
     * but when we want to insert 20 size exceeds then it will remove 3 and insert
     * 20 pq=[4,7,10,20]
     * the for 15 remove 4 insert 15 the pq= [7,10,15,20] and first val ie 7 will be
     * the kth largest
     */

    static void sortFreqOfCharInDescOreder(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a'] = arr[ch - 'a'] + 1;
        }
        Arrays.sort(arr);
        printArr(arr);
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                System.out.println(i + " " + (char) (i + 'a') + "->" + arr[i]);
            }
        }
    }

    static int medianOf2SortedArr(int arr1[], int arr2[]) {// tc 0(log(m+n)) sc 0(n)
        int n = arr1.length, m = arr2.length;
        int ans[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr2[j] < arr1[i]) {
                ans[k++] = arr2[j++];

            } else {
                ans[k++] = arr1[i++];
            }
        }
        while (i < n) {
            ans[k++] = arr1[i++];
        }
        while (j < m) {
            ans[k++] = arr2[j++];
        }

        printArr(ans);
        int med = 0;
        int size = n + m;
        if (ans.length % 2 != 0) {
            med = ans[size / 2];
        } else {
            med = ((ans[size / 2]) + (ans[(size / 2) - 1])) / 2;
            // med = (ans[n / 2] + ans[(n / 2) - 1]) / 2;
        }
        System.out.println();
        System.out.println(med);
        return ans[med];
    }

    /*
     * above method me hum pehle sort karke agar length even ho to 2 val odd hoto
     * mid
     * ex for even [1,3,5] [2,4,6] [1,2,3,4,5,6] ans 3+4/2 =3
     * odd-[1,3,5] [2,4] {1,2,3,4,5] ans = 3
     * yahan bhi yahi kar rahe hai but yahan pe extra array nhi bna rhe hai
     * directly do value nikal rhe hai middle wala
     * agar arr1+arr2.length even hai to 3+4/2 else 3
     */
    static int medianOf2Arr(int arr1[], int arr2[]) { // tc 0(log(m+n)) same as above but sc 0(1)
        int n1 = arr1.length, n2 = arr2.length;
        int n = n1 + n2;
        int idx2 = n / 2;
        int idx1 = idx2 - 1;
        int needVal1 = -1, needVal2 = -1;
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (count == idx1)
                    needVal1 = arr1[i];
                if (count == idx2)
                    needVal2 = arr1[i];
                count++;
                i++;
            } else {
                if (count == idx1)
                    needVal1 = arr2[j];
                if (count == idx2)
                    needVal2 = arr2[j];
                count++;
                j++;
            }
        }
        while (i < n1) {
            if (count == idx1)
                needVal1 = arr1[i];
            if (count == idx2)
                needVal2 = arr1[i];
            count++;
            i++;
        }
        while (j < n2) {
            if (count == idx1)
                needVal1 = arr2[j];
            if (count == idx2)
                needVal2 = arr2[j];
            count++;
            j++;
        }
        System.out.println(needVal1 + " " + needVal2);
        if (n % 2 == 1) {
            return needVal2;
        }
        return (needVal1 + needVal2) / 2;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
