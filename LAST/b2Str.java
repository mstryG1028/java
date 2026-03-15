package LAST;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class b2Str {
    static void printArr(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    // CHECK STRING IS PALINDROME OR NOT

    // static boolean isPalindrome(String s) {
    // String ans = "";
    // for (int i = s.length()-1; i >=0; i--) {
    // ans += s.charAt(i);
    // }
    // // value checks karega or uppercase ko lowercase kar dega
    // if(ans.equalsIgnoreCase(s))return true;
    // return false;
    // }

    static boolean isPalindrome(String str) {
        int s = 0, e = str.length() - 1;
        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;

    }

    // static String rev(String s) {
    // String ans = "";
    // for (int i = s.length()-1; i >=0; i--) {
    // ans += s.charAt(i);
    // }
    // // value checks karega or uppercase ko lowercase kar dega

    // return ans;
    // }
    // Reverse string using StringBuilder
    static String rev(String s) {

        // StringBuilder is mutable, so no new object is created repeatedly
        StringBuilder sb = new StringBuilder(s);

        // reverse() method reverses the string
        return sb.reverse().toString();
    }

    static void countVowelsANdConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            // char curr = s.charAt(i);
            char curr = Character.toLowerCase(s.charAt(i));
            // it will handle lowercase
            if (Character.isLetter(curr)) { // it will ignore

                if (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("vowels: " + vowels + " consonants: " + consonants);
    }

    static boolean isAnagram(String s1, String s2) { // 0(n) 0(1)
        if (s1.length() != s2.length())
            return false;
        int arr[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            arr[ch - 'a']++;
            char ch2 = s2.charAt(i);
            arr[ch2 - 'a']--;

        }

        for (int n : arr) {
            if (n > 0 || n < 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isAnagramBySorting(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);

    }

    static void countOccurenceOfEachChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " ->" + e.getValue());
        }
    }

    static void countOccurenceOfEachCharByArr(String s) {
        // int[] arr = new int[26];
        int[] arr = new int[256]; // htis will consider all characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > 0) {
        // System.out.println((char) ('a' + i) + "->" + arr[i]);
        // }
        // }
        for (int i = 0; i < 256; i++) { // this is for all character
            char ch = (char) (i);
            if (arr[i] > 0) {
                System.out.println((char) (ch - i) + " -> " + arr[i]);
            }
        }

    }

    static String removeRepeated(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (ans.indexOf(curr) == -1) { // indexOf() finds the index of currChar and checks if it is already present
                                           // or not
                ans = ans + curr;
            }
        }
        return ans;

    }

    static boolean remoDuplicatebyHm(String s) {
        HashSet<Character> map = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            map.add(s.charAt(i));
        }
        System.out.println(map);
        return true;
    }

    static String removeDupByArr(String s) {

        // har ek index pe default value false store ho rha hai
        // then usko update kar rhe hai agar pehle se exist nhi karta to ans storing in
        // string ans
        boolean arr[] = new boolean[26];
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int index = curr - 'a';
            if (arr[index] == false) {
                arr[index] = true;
                ans = ans + curr;
            }
        }
        return ans;
    }

    /*
     * | Method | Time Complexity | Order Maintained | Interview Value |
     * | ------------- | --------------- | ---------------- | ----------------------
     * |
     * | indexOf() | O(n²) | Yes | Basic |
     * | HashSet | O(n) | Not guaranteed | Good |
     * | LinkedHashSet | O(n) | Yes | Very Good |
     * | Boolean Array | O(n) | Yes | **Best for lowercase** |
     * 
     */

    // LONGEST COMMON SUBSTRING

    /*
     * Longest Common Prefix (Horizontal Scanning)
     * 
     * Logic:
     * 1. Assume the first string is the prefix.
     * 2. Compare this prefix with the next string.
     * 3. Reduce the prefix until characters match.
     * 4. Continue for all strings in the array.
     * 5. If prefix becomes empty → no common prefix.
     * 
     * Time Complexity:
     * O(N * M)
     * 
     * N = number of strings
     * M = length of smallest string
     */

    static String longestSubStr(String arr[]) {

        // Edge case: empty array
        if (arr.length == 0)
            return "";

        String prefix = arr[0]; // Step 1: take first string as prefix

        for (int i = 1; i < arr.length; i++) {

            int j = 0;

            // Step 2: compare characters of prefix and current string
            while (j < prefix.length() && j < arr[i].length()
                    && prefix.charAt(j) == arr[i].charAt(j)) {
                j++;
            }

            // Step 3: update prefix to the matched part
            prefix = prefix.substring(0, j);

            // Step 4: if prefix becomes empty
            if (prefix.equals(""))
                return "";
        }

        // Step 5: final prefix
        return prefix;
    }
    // -------------------BYSORTING-------------------
    /*
     * Logic:
     * 1. Sort the array of strings.
     * 2. After sorting:
     * - The first string and last string will be the most different.
     * 3. Compare characters of first and last string.
     * 4. The matching prefix between them will be the LCP for the whole array.
     * 
     * Time Complexity:
     * Sorting = O(N log N)
     * Comparison = O(M)
     * Overall ≈ O(N log N)
     * 
     * N = number of strings
     * M = length of smallest string
     */

    static String longestSubStrBySorting(String arr[]) {

        Arrays.sort(arr); // Step 1: sort the array

        String first = arr[0]; // smallest string
        String last = arr[arr.length - 1]; // largest string

        int i = 0;

        // Step 2: compare characters
        while (i < first.length() && i < last.length()
                && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // Step 3: return common prefix
        return first.substring(0, i);
    }

    // ye nhi hua hai
    // static String longestSubStringWithOutRepeat(String s) {
    // String ans = "";
    // for (int i = 0; i < s.length(); i++) {
    // char curr = s.charAt(i);
    // if (ans.indexOf(curr) == -1) {
    // ans += curr;
    // } else {
    // return ans;
    // }
    // }
    // return ans;
    // }

    // ----------------LONGEST SUSTRT WITH K UNIQUE CHARACTER---------
    static boolean containsKUnique(String s, int k) {
        int count = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (ans.indexOf(curr) == -1) {
                ans += curr;
                count++;
            }
        }

        return count == k;
    }

    // this approach TC 0(n*3)
    static String longestSubString(String s, int k) {
        int longest = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);

                if (containsKUnique(sub, k) && sub.length() > longest) {

                    longest = sub.length();
                    ans = sub;

                }
            }

        }
        return ans;
    }

    // -----------LONGEST SUBSTR WITH ALL UNIQUE CHAR-----------
    static boolean containsAllUnique(String s) {

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!(ans.indexOf(curr) == -1)) {
                return false;
            } else {
                ans += curr;
            }
        }

        return true;
    }

    /// complexity TC 0(n*3)
    // static String longestSubStringWithOutRepeat(String s) {
    // int longest = 0;
    // String ans = "";
    // for (int i = 0; i < s.length(); i++) {

    // for (int j = i; j < s.length(); j++) {
    // String sub = s.substring(i, j + 1);

    // if (containsAllUnique(sub) && sub.length() > longest) {

    // longest = sub.length();
    // ans = sub;

    // }
    // }

    // }
    // return ans;
    // }

    static String isUnique(String s) {
        String ans = "";
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (containsAllUnique(sub) && sub.length() > longest) {
                    longest = sub.length();
                    ans = sub;
                }
            }
        }
        return ans;
    }

    static String revSingleWord(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        return ans;
    }

    static void printArr(String arr[]) {
        for (String n : arr) {
            System.out.print(n + " ");
        }
    }

    static void revWordOfString(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = revSingleWord(arr[i]);
        }
        printArr(arr);
    }

    // --------------OR USING STRINGBUILDER---------------------

    static void revWordOfStringByBuilder(String arr[]) {

        for (int i = 0; i < arr.length; i++) {

            // here first we converting string into stringBuilder then rev and then
            // converting to string
            arr[i] = new StringBuilder(arr[i]).reverse().toString();

        }

        printArr(arr);
    }
    // ---------------STRINGCOMPRESSION--------------

    // this is correct but only if all characters are consecutive
    // not corrcet for abbaacd op shoul-> a1b2a2c1d1 but it will give a3b2c1d1
    static String stringCompressionUSingHM(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        for (Character key : map.keySet()) {
            ans = ans + key + map.get(key);
        }
        return ans;
    }

    // -----------------SO---------------

    static String stringCompression(String s) {
        int count = 1;
        String ans = "";
        // for (int i = 0; i < s.length(); i++) {// if i use this the it will throw
        // OouOfBound exception
        for (int i = 0; i < s.length() - 1; i++) { // therefore use combo of this and
            char curr = s.charAt(i);
            if (s.charAt(i) == s.charAt(i + 1)) {

                count++;
            } else {
                ans = ans + curr + count;
                count = 1;
            }
        }
        ans = ans + s.charAt(s.length() - 1) + count; // this is for last character
        return ans;
    }

    static boolean stringIsRotationOfAnother(String s1, String s2) {

        // Step 1: lengths must be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: concatenate string with itself
        String temp = s1 + s1;

        // Step 3: check if s2 is substring
        if (temp.contains(s2)) {
            return true;
        }

        return false;
    }

    static int factorial(int n) {
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans = ans * i;
        }
        return ans;
    }

    static boolean hai(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + factorial(rem);
            n = n / 10;
        }
        if (sum == temp) {
            return true;

        }
        return false;
    }

   

    public static void main(String[] args) {

        System.out.println(hai(145));

    }
}


/*

========================================================
PERMUTATIONS OF A STRING – COMPLETE NOTES + CODE
========================================================

1. What is Permutation?
Permutation means arranging characters in all possible orders.

Example:
String = "ABC"

ABC
ACB
BAC
BCA
CAB
CBA


--------------------------------------------------------
2. Total Number of Permutations (All Characters Unique)
--------------------------------------------------------

Formula:
n!

where
n = length of string
! = factorial

Example:
"ABC"

n = 3

3! = 3 × 2 × 1 = 6 permutations


--------------------------------------------------------
3. If Characters Repeat
--------------------------------------------------------

Formula:

n! / (freq1! × freq2! × freq3! ...)

Example:
"AAB"

n = 3

3! / 2! = 3

Permutations:
AAB
ABA
BAA


--------------------------------------------------------
4. Java Code to Find Factorial
--------------------------------------------------------


class PermutationNotes {

    // factorial function
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


/*
--------------------------------------------------------
5. Count permutations when ALL characters are UNIQUE
--------------------------------------------------------


    static int countUniquePermutations(String s) {
        int n = s.length();
        return factorial(n);
    }


/*
--------------------------------------------------------
6. Count permutations when characters may repeat
--------------------------------------------------------


    static int countPermutationsWithDuplicates(String s) {

        int n = s.length();
        int[] freq = new int[256];

        // count frequency of characters
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }

        int numerator = factorial(n);
        int denominator = 1;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                denominator = denominator * factorial(freq[i]);
            }
        }

        return numerator / denominator;
    }


/*
--------------------------------------------------------
7. Driver Code
--------------------------------------------------------


    public static void main(String[] args) {

        String s1 = "ABC";
        System.out.println("Unique permutations: "
                + countUniquePermutations(s1));

        String s2 = "AAB";
        System.out.println("Permutations with duplicates: "
                + countPermutationsWithDuplicates(s2));
    }
}
*/