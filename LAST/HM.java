package LAST;

import java.util.HashSet;
import java.util.Stack;

class HM {
    // static char firstNonRepeatingChar(String s) {
    // HashMap<Character, Integer> set = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // char curr = s.charAt(i);
    // set.put(curr, set.getOrDefault(curr, 0) + 1);
    // }
    // for (int i = 0; i < s.length(); i++) {
    // char curr = s.charAt(i);
    // if (set.get(curr) == 1) {
    // return curr;
    // }
    // }
    // return '#';
    // }

    static char firstNonRepeatng(String s) {
        // aabbcde
        int i = 0;
        while (i < s.length()) {
            // str.substring(st,end) // it will include st but not consider last
            String str1 = s.substring(0, i);
            String str2 = s.substring(i + 1);
            if (str1.indexOf(s.charAt(i)) == -1 && str2.indexOf(s.charAt(i)) == -1) {
                return s.charAt(i);
            }
            i++;
        }
        return '\n';
    }

    static HashSet<Integer> commonElementIn2Arr(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            if (set.contains(i)) {
                ans.add(i);
            }
        }
        System.out.println(ans);
        return ans;
    }

    static void longestConsecutiveSeq(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int count = 0;
        int maxLength = 0;
        for (int i : arr) {
            if (!set.contains(i + 1)) { // here we are finding the max starting point by checking prev no
                int curr = i;
                count = 1;
                while (set.contains(curr - 1)) {
                    // yahan directly i ko increase nhi kar sakte isliye tenp var liya hai for
                    // traverse
                    curr--;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }

        }
        System.out.println(maxLength);
    }

    static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int[] nextGreaterEle(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // Remove all smaller elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack empty → no greater element
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            // Push current element
            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(gcd);
    }
}
