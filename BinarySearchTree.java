class Node {
    public int data;
    public Node left;
    public Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {

    public Node root;

    public BST add(int data) {
        if (root == null) {
            this.root = new Node(data);
        } else {
            this.addRecursive(root, data);
        }
        return this;
    }

    public void preOrderTraversal() {
        this.preOrderTraversal(root);
    }

    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println("The preOrder " + root.data);
        this.preOrderTraversal(root.left);
        this.preOrderTraversal(root.right);
    }

    public void inOrderTraversal() {
        this.inOrderTraversal(root);
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        this.inOrderTraversal(root.left);
        System.out.println("The inOrder " + root.data);
        this.inOrderTraversal(root.right);
    }

    public void postOrderTraversal() {
        this.postOrderTraversal(root);
    }

    public void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        this.postOrderTraversal(root.left);
        System.out.println("The postOrder " + root.data);
        this.postOrderTraversal(root.right);
    }

    private Node addRecursive(Node parentRoot, int data) {
        if (parentRoot == null) {
            Node node = new Node(data);
            parentRoot = node;
        } else {
            int rootValue = parentRoot.data;
            if (data < rootValue) {
                parentRoot.left = addRecursive(parentRoot.left, data);
            } else {
                parentRoot.right = addRecursive(parentRoot.right, data);
            }
        }
        return parentRoot;
    }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bt = new BST();
        bt.add(3);
        bt.add(4);
        bt.add(2);
        bt.preOrderTraversal();
    }

}
