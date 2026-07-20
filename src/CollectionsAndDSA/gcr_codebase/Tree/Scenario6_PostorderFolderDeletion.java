import java.util.*;

public class Scenario6_PostorderFolderDeletion {
    public static class Node {
        public String val;
        public Node left, right;
        public Node(String val) {
            this.val = val;
        }
    }

    public static void deleteNode(Node node) {
        System.out.println("Deleted folder node: " + node.val);
    }

    public static void deleteFolderTree(Node node) {
        if (node == null) return;
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node); // safe: both children are already fully deleted
    }

    public static void main(String[] args) {
        Node root = new Node("root");
        root.left = new Node("subfolder_A");
        root.right = new Node("subfolder_B");
        root.left.left = new Node("file_1");
        root.left.right = new Node("file_2");

        System.out.println("Starting postorder folder deletion:");
        deleteFolderTree(root);
    }
}
