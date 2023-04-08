package TREE;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(50);
        tree.addNode(40);
        tree.addNode(30);
        tree.addNode(60);
        tree.addNode(100);
        tree.addNode(12);
        tree.addNode(64);
        tree.addNode(98);
        tree.addNode(45);
        tree.traverse();
        System.out.println("Height of the tree is -> "+ tree.height());
        tree.nodeAtK(1);
    }
}
