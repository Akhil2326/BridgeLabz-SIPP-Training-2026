import java.util.*;

public class Scenario5_KthSmallestLatency {
    public static class Node {
        public int val;
        public Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static int kthSmallest(Node root, int k) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        int count = 0;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            count++;
            if (count == k) return current.val;
            current = current.right;
        }
        throw new IllegalArgumentException("k out of range");
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.right = new Node(2);

        int k = 2;
        System.out.println(k + "-th smallest element: " + kthSmallest(root, k));
    }
}
