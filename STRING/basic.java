
package STRING;
import java.util.HashMap;

public class basic {

//NOTE: USE OF sTRING.SPLIT();
//  str.split()
    void splitString(String s) {
        String name = "  my  name is dee,pak ";
        String arr[] = name.split(",");
        for (String s1 : arr) {
            System.out.print(s1 + " ");
        }
    }

    //isPAlindrome 
    static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // above line will skip all char and spaces due to '^' use it is responsible of special char
        // (space) , . : ! @ # $ % ^ & * ( ) [ ] { } etc.
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
        while (n != 1 && n != 4) {
            String s = String.valueOf(n);
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';
                sum = sum + digit * digit;
            }
            n = sum;
        }
        return n == 1;
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
    static int lengthOfLAstWord(String s) {
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                if (count == 0) {
                    i--;
                } else {
                    break;
                }
            } else {
                count++;
                i--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(isPalindrome(""));
        String s = "abc";
        String t = "bcde";
        System.out.println(isSubsequence(s, t));
    }
}
