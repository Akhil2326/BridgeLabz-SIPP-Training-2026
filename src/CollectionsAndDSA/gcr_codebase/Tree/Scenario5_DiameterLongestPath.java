import java.util.*;

public class Scenario5_DiameterLongestPath {
    public static class Node {
        public int val;
        public Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    private static int diameter = 0;

    public static int longestCommunicationPath(Node root) {
        diameter = 0;
        heightAndUpdateDiameter(root);
        return diameter;
    }

    private static int heightAndUpdateDiameter(Node node) {
        if (node == null) return -1;
        int leftHeight = heightAndUpdateDiameter(node.left);
        int rightHeight = heightAndUpdateDiameter(node.right);
        diameter = Math.max(diameter, leftHeight + rightHeight + 2);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Longest Communication Path (Diameter): " + longestCommunicationPath(root));
    }
}
