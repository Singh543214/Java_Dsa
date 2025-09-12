class Nodes {
    int data;
    Nodes left, right;
    Nodes(int data) {
        this.data = data;
        left = right = null;
    }
}

public class InvertBinaryTree {
    Nodes root;

    Nodes invert(Nodes node) {
        if (node == null) return null;

        // swap children
        Nodes temp = node.left;
        node.left = node.right;
        node.right = temp;

        // recurse
        invert(node.left);
        invert(node.right);

        return node;
    }

    void inorder(Nodes node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();
        tree.root = new Nodes(4);
        tree.root.left = new Nodes(2);
        tree.root.right = new Nodes(7);
        tree.root.left.left = new Nodes(1);
        tree.root.left.right = new Nodes(3);
        tree.root.right.left = new Nodes(6);
        tree.root.right.right = new Nodes(9);

        System.out.print("Original Inorder: ");
        tree.inorder(tree.root);

        tree.invert(tree.root);

        System.out.print("\nInverted Inorder: ");
        tree.inorder(tree.root);
    }
}
