

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
    // static boolean isAnagram(String s, String t) {
// if (s.length() != t.length()) return false;
    //     int arr[] = new int[26];
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         arr[ch - 'a'] = arr[ch - 'a'] + 1;
    //     }
    //     for(int i=0;i<t.length();i++){
    //         char ch = t.charAt(i);
    //         arr[ch - 'a'] = arr[ch - 'a'] - 1; 
    //         if(arr[ch-'a']<0)return false;
    //     }
    //     return true;
    // }
//     static boolean isAnagram(String s, String t) {
//     if (s.length() != t.length()) return false;
//     int arr[] = new int[26];
//     for (int i = 0; i < s.length(); i++) {
//         arr[s.charAt(i) - 'a']++;
//         arr[t.charAt(i) - 'a']--;
//     }
//     for (int count : arr) {
//         if (count != 0) return false;
//     }
//     return true;
// }
    // static boolean isoMorphic(String a, String b) {
    //     HashMap<Character, Character> map = new HashMap<>();
    //     if (a.length() != b.length()) {
    //         return false;
    //     }
    //     for (int i = 0; i < a.length(); i++) {
    //         char key = a.charAt(i);
    //         char value = b.charAt(i);
    //         if (map.containsKey(key)) {
    //             if (map.get(key) != value)  return false;
    //             } else if (map.containsValue(value)) {  // this is especialy for aa,ab
    //                 return false;
    //             } else {
    //                 map.put(key, value);
    //             }
    //         }
    //         return true;
    //     }
    // static boolean wordPattern(String pattern, String s) {
    //     String key = "";
    //     int j = 0;
    //     // String pattern = "aaaa";
    //     // String s = "dog cat cat dog";
    //     HashMap<String, Character> map = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         if (s.charAt(i) == ' ' || i == s.length()) {
    //             if (j >= pattern.length()) {
    //                 return false;
    //             }
    //             if (map.containsKey(key)) {
    //                 if (map.get(key) != pattern.charAt(j)) {
    //                     return false;
    //                 } else if (map.containsValue(pattern.charAt(j))) {
    //                     return false;
    //                 }
    //             } else {
    //                 map.put(key, pattern.charAt(j));
    //                 key = "";
    //                 j++;
    //             }
    //         } else {
    //             key = key + s.charAt(i);
    //         }
    //     }
    //     return true;
    // }
//     static boolean wordPattern(String pattern, String s) {
//     String[] words = s.split(" ");
//     if (words.length != pattern.length())
//         return false;
//     HashMap<Character, String> map1 = new HashMap<>();
//     HashMap<String, Character> map2 = new HashMap<>();
//     for (int i = 0; i < pattern.length(); i++) {
//         char ch = pattern.charAt(i);
//         String word = words[i];
//         if (map1.containsKey(ch)) {
//             if (!map1.get(ch).equals(word))
//                 return false;
//         } else {
//             if (map2.containsKey(word))
//                 return false;
//             map1.put(ch, word);
//             map2.put(word, ch);
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
    // static int largestSubArr(int arr[]) {
    //     int pref = 0;
    //     int maxLength = 0;
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     // int arr[]={15,-2,2,-8,1,7,10,23};
    //     //  prefSum= [15,13,15,7,8,15,25,48]
    //     for (int i = 0; i < arr.length; i++) {
    //         pref = pref + arr[i];
    //         if (map.containsKey(pref)) {
    //             maxLength = Math.max(maxLength, i - map.get(pref));
    //         } else {
    //             map.put(pref, i);
    //         }
    //     }
    //     return maxLength;
    // }


//     static char findDiff(String s, String t) {
//         HashMap<Character, Integer> map = new HashMap<>();

// //this help to reduce code for if contains then increse
// //not conatins then put
//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }


//         for (char curr : t.toCharArray()) {
//             if (map.containsKey(curr)) {
//                 map.put(curr, map.get(curr) - 1);
//                 if (map.get(curr) == 0) {
//                     map.remove(curr);
//                 }
//             } else {
//                 return curr;
//             }
//         }
//         return s.charAt(0);

//     }
   
   //NOTE: eff way to find diff
    // static char findDiff(String s, String t) {
    //     char result = 0;

    //     for (char c : s.toCharArray()) {
    //         result ^= c;   // XOR all chars in s
    //     }
    //     for (char c : t.toCharArray()) {
    //         result ^= c;   // XOR all chars in t
    //     }

    //     return result;
    // }



     static public  void main(String[] args) {
System.out.println("hello");
    }
}
