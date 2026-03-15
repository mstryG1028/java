package STRING;

import java.util.HashMap;

public class basic {

//NOTE: USE OF STRING.SPLIT();
//  str.split()
    static void splitString(String s) {

        String arr[] = s.split(" ");
        for (String s1 : arr) {
            System.out.print(s1 + " ");
        }
    }

    static StringBuilder removeSpecialChar(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = (int) (s.charAt(i));
            if (num >= 0 && num <= 57 || num >= 123 && num <= 126 || num >= 91 && num <= 96) {
                continue;
            } else {
                result.append(s.charAt(i));
            }
        }
        System.out.println(result);
        return result;

    }

    static void printAToZ(char ch) {
        // if (ch == 'A') {
        //     int no = 65;
        //     for (int i = 0; i < 26; i++) {
        //         System.out.print((char) (no + i)+" ");
        //     }
        // } else if (ch == 'a') {
        //     int no = 97;
        //     for (int i = 0; i < 26; i++) {
        //         System.out.print((char) (no + i)+" ");
        //     }
        // }
        switch (ch) {
            case 'A': {
                int no = 65;
                for (int i = 0; i < 26; i++) {
                    System.out.print((char) (no + i) + " ");
                }
                System.out.println();
                break;
            }
            case 'a': {
                int no = 97;
                for (int i = 0; i < 26; i++) {
                    System.out.print((char) (no + i) + " ");
                }
                System.out.println();
                break;
            }
            default: {
                System.out.println("NOt valid input");
            }
        }
    }
    // NOTE: to get int from char just substract with zero
    // String s = "deepak";
    //     System.out.println(s.charAt(4) - 0); // op: 97 

    //isPAlindrome 
    static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // above line will skip all char and spaces due to '^' use it is responsible of special char
        // i.e (space) , . : ! @ # $ % ^ & * ( ) [ ] { } etc.
        System.out.println(s);
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    // isSubSequence
    static boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    static int strStr(String heyStack, String needle) {
        int n = 0;
        int h = 0;
        int index = 0;
        for (int i = 0; i < heyStack.length(); i++) {
            if (heyStack.charAt(i) == needle.charAt(n)) {
                if (n == 0) {
                    index = i;
                }
                n++;
                if (n == needle.length()) {
                    return index;
                }
            } else {
                if (n > 0) {
                    i = index;
                }
                n = 0;
            }
        }
        return -1;
    }

    static boolean isRansomNote(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']--;
            if (count[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (map.containsKey(key)) {
                if (map.get(key) != value) {
                    return false;
                } else if (map.containsValue(value)) {
                    return false;
                }
            } else {
                map.put(key, value);
            }
        }
        return true;
    }

    static boolean happyNumber(int n) {
        while (n != 1 && n != 4) { //if n=4 then it will never be a happy no
            //bcz it will repeat the cycle
            // 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 
            String s = String.valueOf(n);
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';
                sum = sum + digit * digit;
            }
            n = sum;
        }
        return n == 1; // 1 means happy no if value of n becomes 1 means stop
    }

    static String revString(String word) {
        String revStr = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revStr += word.charAt(i);
        }
        return revStr;
    }

    static void mainRev(String s) {
        String word = "";
        String Rev = "";
        int charCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && charCount == 0) {
                continue;
            } else if (s.charAt(i) == ' ' && charCount > 0) {
                Rev += revString(word) + " ";
                charCount = 0;
                word = "";
            } else {
                word += s.charAt(i);
                charCount++;
            }
        }
        if (charCount > 0) {
            Rev += revString(word);
        }
        System.out.println(Rev.trim());
    }

    //LENGTH OF LAST WORD
    // static int lengthOfLAstWord(String s) {
    //     int count = 0;
    //     int i = s.length() - 1;
    //     while (i >= 0) {
    //         if (s.charAt(i) == ' ') {
    //             if (count == 0) {
    //                 i--;
    //             } else {
    //                 break;
    //             }
    //         } else {
    //             count++;
    //             i--;
    //         }
    //     }
    //     return count;
    // }

    // using for loop
    static int lengthofLAst(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char curr = s.charAt(i);
            if (curr == ' ') {
                if (count != 0) {
                    break;
                }
            } else {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
System.out.println((int) Math.sqrt(25));
    }
}

// Java String Methods (Quick Notes)

// Length and Check
// length() - used for finding total number of characters
// isEmpty() - used for checking if string length is 0
// isBlank() - used for checking if string is empty or contains only spaces

//Space Handling
// trim() - used for removing spaces from start and end
// strip() - used for removing Unicode spaces from start and end
// stripLeading() - used for removing spaces from beginning
// stripTrailing() - used for removing spaces from end

//Character Acccess
// charAt(int index) - used for getting character at given index
// toCharArray() - used for converting string to character array

// Comparison
// equals(Object obj) - used for comparing content (case-sensitive)
// equalsIgnoreCase(String s) - used for comparing content ignoring case
// compareTo(String s) - used for lexicographical comparison
// compareToIgnoreCase(String s) - used for comparison ignoring case

//Searching
// contains(CharSequence s) - used for checking substring existence
// indexOf(char/String) - used for finding first occurrence
// lastIndexOf(char/String) - used for finding last occurrence
// startsWith(String prefix) - used for checking starting characters
// endsWith(String suffix) - used for checking ending characters

//Modification
// toUpperCase() - used for converting to uppercase
// toLowerCase() - used for converting to lowercase
// replace(char old, char new) - used for replacing characters
// replace(String old, String new) - used for replacing substring
// replaceAll(String regex, String new) - used for replacing using regex
// replaceFirst(String regex, String new) - used for replacing first match
// substring(int begin) - used for extracting substring from index
// substring(int begin, int end) - used for extracting substring between indexes end index not included
// if (0,4) then 0-1-2-3 will be considered
// concat(String s) - used for joining strings

// Split and join
// split(String regex) - used for splitting string into array
// split(String regex, int limit) - used for splitting with limit
// String.join(delimiter, elements) - used for joining multiple strings

//Conversion
// valueOf(any type) - used for converting other types to String
// format(String format, args...) - used for formatted string creation

//MAtching and validations
// matches(String regex) - used for checking regex match

//interning
// intern() - used for storing string in string constant pool

//Object Methods (Inherited)
// toString() - used for returning string itself
// getBytes() - used for converting string to byte array

// Note:
// Strings are immutable – any modification creates a new object



/*
| ASCII range   | Characters                         |
| ------------- | ---------------------------------- |
| **0 – 31**    | Control characters (non-printable) |
| **32**        | Space                              |
| **33 – 47**   | **Special characters**             |
| **48 – 57**   | Digits `0–9`                       |
| **58 – 64**   | **Special characters**             |
| **65 – 90**   | Uppercase `A–Z`                    |
| **91 – 96**   | **Special characters**             |
| **97 – 122**  | Lowercase `a–z`                    |
| **123 – 126** | **Special characters**             |

 */
