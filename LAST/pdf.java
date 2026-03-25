package LAST;

public class pdf {
    static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void sortArr(int arr[]) {

        int s = 0;
        int e = arr.length - 1;
        int i = 0;
        while (i <= e)
            // {0,1,2,1,2,0,2,0}
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;
                i++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[e];
                arr[e] = temp;
                e--;
                
            } else {
                i++;
            }
        printArr(arr);
    }

    static int checkPrev(int arr[]) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                count++;
                max = arr[i];
            }

            // 7,4,8,2,9
        }
        return count;
    }

    // static int allPermutationOfStrOrArr(int)

    public static void main(String[] args) {
        int arr[] = { 2, 0, 1, 2, 1, 0, 0, 1 };
        sortArr(arr);
    }
}
