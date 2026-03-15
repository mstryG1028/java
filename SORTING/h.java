package SORTING;

public class h {

    static void printArr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void printArr(String arr[]) {
        for (String val : arr) {
            System.out.print(val + " ");
        }
    }

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);
    }

    // BUBBLE SORT TO SORT ARR OF STRINGS
    static void bubbleSortStr(String arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].equals(arr[j + 1])) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArr(arr);
    }

    static long maxkeep(int cost[], String s) {
        long total = 0;
        for (int c : cost)
            total += c;
        long[] keep = new long[26];
        for (int i = 0; i < s.length(); i++) {
            keep[s.charAt(i) - 'a'] += cost[i];
        }
        long maxKeep = 0;
        for (long v : keep) {
            maxKeep = Math.max(maxKeep, v);
        }
        return total - maxKeep;
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
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    static void merge(int arr[], int start, int end, int mid) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) { // similarly here for ASC and DESC order
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= end) {
            temp[k++] = arr[j++];

        }
        for (int idx = 0; idx < temp.length; idx++) {
            arr[idx + start] = temp[idx];
        }
    }

    static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, end, mid);
        }
    }

    static void selectionSort(int arr[]) {
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
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 1, 2, 0 };
       

    }

}
