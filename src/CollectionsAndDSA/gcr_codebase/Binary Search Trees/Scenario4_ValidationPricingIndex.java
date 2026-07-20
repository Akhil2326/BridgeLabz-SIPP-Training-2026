import java.util.*;

public class Scenario4_ValidationPricingIndex {
    public static class Node {
        public int val;
        public Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(Node node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(6); // invalid placement, 6 is in the right subtree of 10 but must be > 10

        System.out.println("Is valid BST? " + isValidBST(root));
    }
}
