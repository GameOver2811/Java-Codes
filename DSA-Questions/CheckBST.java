class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class CheckBST {
    public static boolean checkBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        // Check current node value is within the allowable range
        if (root.data <= min || root.data >= max) {
            return false;
        }

        return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
    }

    public static boolean isBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        // Check if the binary tree is a BST
        if (isBST(root)) {
            System.out.println("The binary tree is a BST.");
        } else {
            System.out.println("The binary tree is not a BST.");
        }

        // Creating a non-BST tree
        Node rootNonBST = new Node(4);
        rootNonBST.left = new Node(2);
        rootNonBST.right = new Node(6);
        rootNonBST.left.left = new Node(1);
        rootNonBST.left.right = new Node(5); // This makes it not a BST

        // Check if the binary tree is a BST
        if (isBST(rootNonBST)) {
            System.out.println("The binary tree is a BST.");
        } else {
            System.out.println("The binary tree is not a BST.");
        }
    }
}
