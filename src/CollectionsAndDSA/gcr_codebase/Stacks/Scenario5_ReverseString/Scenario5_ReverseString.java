package Stacks.Scenario5_ReverseString;

import java.util.Stack;

public class Scenario5_ReverseString {
    public static String reverse(String str) {
        if (str == null) return null;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "BridgeLabz";
        String reversed = reverse(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed); // Expected: zbaLegdirB
    }
}
