
public class h {

    static void printArr(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

//     static long maxkeep(int cost[],String s) {
//   long total = 0;
//         for (int c : cost) total += c;
//         long[] keep = new long[26];
//         for (int i = 0; i < s.length(); i++) {
//             keep[s.charAt(i) - 'a'] += cost[i];
//         }
//         long maxKeep = 0;
//         for (long v : keep) {
//             maxKeep = Math.max(maxKeep, v);
//         }
//         return total - maxKeep;
//     }
    // static void quickSort(int arr[], int start, int end) {
    //     if (start < end) { 
    //         int pivotIdx = partition(arr, start, end);
    //         quickSort(arr, start, pivotIdx - 1);
    //         quickSort(arr, pivotIdx + 1, end);
    //     }
    // }
    // static int partition(int arr[], int start, int end) {
    //     int i = start - 1;
    //     int pivot = arr[end];
    //     for (int j = start; j < end; j++) {
    //         if (arr[j] <= pivot) {//this is for ascending order
    //            // if(arr[j]>=pivot){ // this is for descending
    //             i++;
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     int temp = arr[i + 1];
    //     arr[i + 1] = arr[end];
    //     arr[end] = temp;
    //     return i + 1;
    // }
    static void merge(int arr[], int start, int end, int mid) {
         int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k=0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) { //similarly here for ASC and DESC order
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
        for(int idx=0;idx<temp.length;idx++){
            arr[idx+start]=temp[idx];
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

    public static void main(String[] args) {
        int arr[] = {5, 2, 6, 4, 1, 3};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }

}
