import java.util.Stack;
import java.util.*;

public class ValidParenthesis {
    static boolean checkParenthesis(String s, Stack<Character> stack) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                if ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == '}' && stack.peek() == '{')
                        || (s.charAt(i) == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "()[]{}";
        System.out.println(checkParenthesis(s, stack));
    }
}
