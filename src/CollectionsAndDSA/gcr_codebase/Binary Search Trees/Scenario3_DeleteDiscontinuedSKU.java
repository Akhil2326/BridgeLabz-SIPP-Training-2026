import java.util.*;

public class Scenario3_DeleteDiscontinuedSKU {
    public static class Node {
        public int val;
        public Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static Node delete(Node node, int sku) {
        if (node == null) return null;
        if (sku < node.val) {
            node.left = delete(node.left, sku);
        } else if (sku > node.val) {
            node.right = delete(node.right, sku);
        } else {
            if (node.left == null && node.right == null) return null; // leaf
            if (node.left == null) return node.right; // one child
            if (node.right == null) return node.left; // one child
            Node successor = node.right; // two children
            while (successor.left != null) successor = successor.left;
            node.val = successor.val;
            node.right = delete(node.right, successor.val);
        }
        return node;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.print("Before delete (inorder): ");
        inorder(root);
        System.out.println();

        root = delete(root, 30); // delete node with two children

        System.out.print("After deleting 30 (inorder): ");
        inorder(root);
        System.out.println();
    }
}
