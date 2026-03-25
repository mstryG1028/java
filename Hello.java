
package JAVA;

class Hello {

     public static void main(String args[]) {
          String s = "aaabbc";

          String ans = "";
          int i = 0;
          while (i < s.length()) {
               int count = 1;
               int j = i;
               while (j + 1 < s.length() && s.charAt(j).equals(s.charAt(j + 1))) {

                    count++;
                    j++;
               }
               ans = ans + s.charAt(i) + count;
               i = j + 1;

          }

     }

}