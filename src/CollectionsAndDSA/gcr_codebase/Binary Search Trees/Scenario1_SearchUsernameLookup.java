import java.util.*;

public class Scenario1_SearchUsernameLookup {
    public static class Node {
        public int val;
        public Node left, right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static boolean search(Node root, int target) {
        Node current = root;
        while (current != null) {
            if (target == current.val) return true;
            current = (target < current.val) ? current.left : current.right;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        int target1 = 40;
        int target2 = 60;
        System.out.println("Search target " + target1 + ": " + search(root, target1));
        System.out.println("Search target " + target2 + ": " + search(root, target2));
    }
}
