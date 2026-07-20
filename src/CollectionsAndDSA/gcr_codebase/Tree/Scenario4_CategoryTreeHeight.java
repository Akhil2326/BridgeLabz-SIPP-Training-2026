import java.util.*;

public class Scenario4_CategoryTreeHeight {
    public static class Node {
        public int val;
        public Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static int height(Node node) {
        if (node == null) return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.left = new Node(4);

        int threshold = 2;
        System.out.println("Tree height: " + height(root));
        System.out.println("Is tree height too deep (threshold=" + threshold + ")? " + isTooDeep(root, threshold));
    }
}
