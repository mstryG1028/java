
import java.util.HashMap;



public class q {

    // static int findFreq(HashMap<Integer, Integer> map, int arr[]) {
    //     int max = 0;
    //     int ansKey = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (!map.containsKey(arr[i])) {
    //             map.put(arr[i], 1);
    //         } else {
    //             map.put(arr[i], map.get(arr[i]) + 1);
    //         }
    //     }
    //     for (Map.Entry<Integer, Integer> e : map.entrySet()) {
    //         if (e.getValue() > max) {
    //             max = e.getValue();
    //             ansKey = e.getKey();
    //         }
    //     }
    //     return ansKey;
    // }
    // static String isAnagram(String A, String B) {
    //     HashMap<Character, Integer> map1 = new HashMap<>();
    //     if (A.length() != B.length()) {
    //         return "no";
    //     }
    //     for (int i = 0; i < A.length(); i++) {
    //         char currChar = A.charAt(i);
    //         if (!map1.containsKey(currChar)) {
    //             map1.put(currChar, 1);
    //         } else {
    //             map1.put(currChar, map1.get(currChar) + 1);
    //         }
    //     }
    //     for (int i = 0; i < B.length(); i++) {
    //         char currChar = B.charAt(i);
    //         if (!map1.containsKey(currChar)) {
    //             return "no";
    //         } else if(map1.get(currChar)>1) {
    //             map1.put(currChar, map1.get(currChar) - 1);
    //         } else{
    //             map1.remove(currChar);
    //         }
    //     }
    //     return "yes";
    // }
    // static boolean isoMorphic(String a, String b) {
    //     HashMap<Character, Character> map = new HashMap<>();
    //     if (a.length() != b.length()) {
    //         return false;
    //     }
    //     for (int i = 0; i < a.length(); i++) {
    //         char key = a.charAt(i);
    //         char value = b.charAt(i);
    //NOTE: yahan pe mai key and value dono check kar rha hu
    //1.) containsKey me check kar rha hu value same hai ki nhi
    //2.) not contains means key nhi hai isliye value check kar rha hu
    // since value bhi same nhi hona chaiye 1 key ka 
    // ex 'ab' 'cc' key are diff value is same  therefore false
    //         if (map.containsKey(key)) {
    //             if (map.get(key) != value) {
    //                 return false;
    //             }
    //         } else if (map.containsValue(value)) {
    //             return false;
    //         } else {
    //             map.put(key, value);
    //         }
    //     }
    //     return true;
    // }
    // static int[] twoSum(int arr[], int target) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     int ans[] = {-1};
    //     for (int i = 0; i < arr.length; i++) {
    //         if (map.containsKey(target - arr[i])) {
    //             ans = new int[]{i, map.get(arr[i])};
    //             return ans;
    //         } else {
    //             map.put(arr[i], i);
    //         }
    //     }
    //     return ans;
    // }

    
    static int largestSubArrSum(int arr[]) {
        int pref = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // int arr[]={15,-2,2,-8,1,7,10,23};
        //  prefSum= [15,13,15,7,8,15,25,48]
        for (int i = 0; i < arr.length; i++) {
            pref = pref + arr[i];
            if (map.containsKey(pref)) {
                maxLength = Math.max(maxLength, i - map.get(pref));
            } else {
                map.put(pref, i);
            }
        }
        return maxLength;
    }

    
    public static void main(String[] args) {
        // String A = "aacc";
        // String B = "ccac";
        // System.out.println(isAnagram(A, B));
        // String a = "egg";
        // String b = "add";
        // System.out.println(isoMorphic(a, b));
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(largestSubArrSum(arr));
        // int arr[] = {2, 5, 2, 8, 90, 3, 2, 5};
        // findFreq(arr);
      
    }
}
