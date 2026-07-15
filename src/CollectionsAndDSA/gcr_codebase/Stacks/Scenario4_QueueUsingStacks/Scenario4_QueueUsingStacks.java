package Stacks.Scenario4_QueueUsingStacks;

import java.util.Stack;

public class Scenario4_QueueUsingStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        Scenario4_QueueUsingStacks queue = new Scenario4_QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Front element: " + queue.peek()); // Expected: 1
        System.out.println("Dequeued: " + queue.dequeue());   // Expected: 1
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected: false
    }
}
