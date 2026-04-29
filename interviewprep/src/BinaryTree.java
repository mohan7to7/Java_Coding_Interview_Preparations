class Node {
    int data;
    Node left;
    Node right;

    public Node (int value){
        this.data = value;
        this.left = this.right = null;
    }
}

public class BinaryTree {
    Node root;

    public void traverseInorder(Node node){
        if(node == null) return;
        traverseInorder(node.left);
        System.out.print(node.data + " ");
        traverseInorder(node.right);
    }
    static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        tree.traverseInorder(tree.root);
    }
}
