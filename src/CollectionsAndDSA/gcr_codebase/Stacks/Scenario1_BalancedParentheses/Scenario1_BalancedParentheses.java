package Stacks.Scenario1_BalancedParentheses;

import java.util.Stack;

public class Scenario1_BalancedParentheses {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "{[()]}";
        String expr2 = "{[(])}";
        System.out.println("Expression: " + expr1 + " -> Is Balanced? " + isBalanced(expr1));
        System.out.println("Expression: " + expr2 + " -> Is Balanced? " + isBalanced(expr2));
    }
}
