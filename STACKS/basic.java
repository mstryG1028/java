
import java.util.Stack;


public class basic {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '[' || curr == '{' || curr == '(') {
                st.push(curr);
            } else if (curr == ']' || curr == '}' || curr == ')') {
                   if (st.isEmpty()) {
                return false; // No opening bracket for this closing
            }
            char top=st.peek();
                if (curr==']'&& top !='['||curr=='}'&& top !='{'||curr==')'&& top !='(') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(isValid(s));
    }
}