package Stacks.Scenario2_MinStack;

import java.util.Stack;

public class Scenario2_MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int popped = stack.pop();
            if (popped == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Scenario2_MinStack minStack = new Scenario2_MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Minimum: " + minStack.getMin()); // Expected: -3
        minStack.pop();
        System.out.println("Top element: " + minStack.top());   // Expected: 0
        System.out.println("Minimum: " + minStack.getMin()); // Expected: -2
    }
}
