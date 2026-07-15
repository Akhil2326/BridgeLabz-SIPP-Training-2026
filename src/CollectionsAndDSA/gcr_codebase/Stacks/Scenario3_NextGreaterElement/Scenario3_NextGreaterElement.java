package Stacks.Scenario3_NextGreaterElement;

import java.util.Arrays;
import java.util.Stack;

public class Scenario3_NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements that are smaller than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If stack is empty, there is no greater element to the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            // Push current element to stack
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] result = nextGreaterElement(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result)); // Expected: [5, 25, 25, -1]
    }
}
