import java.util.*;

public class Scenario2_InsertEmployeeID {
    public static class Node {
        public int val;
        public Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static Node insert(Node node, int id) {
        if (node == null) {
            return new Node(id);
        }
        if (id < node.val) {
            node.left = insert(node.left, id);
        } else if (id > node.val) {
            node.right = insert(node.right, id);
        }
        return node;
    }

    // Helper to print inorder traversal to verify insert
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root = insert(root, 50);
        root = insert(root, 150);
        root = insert(root, 25);
        root = insert(root, 75);

        System.out.print("BST elements after insertions (inorder): ");
        inorder(root);
        System.out.println();
    }
}
