
public class bit {

    static void singleEle(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];  // A^A=0   A^0=A
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 2, 5, 5, 1};
        singleEle(arr);
    }
}
