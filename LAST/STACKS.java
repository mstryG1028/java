
package LAST;

import java.util.Stack;

// stack using array
class stack{
    int size;

}

public class STACKS {
    static boolean validParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == ']' || curr == '}' || curr == ')') {
                if(st.isEmpty())return false;
                if (curr == ']' && st.peek() == '[' || curr == '}' && st.peek() == '{'
                        || curr == ')' && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }

            } else {
                st.push(curr);
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
System.out.println(validParenthesis("{[()]]}"));
    }
}
