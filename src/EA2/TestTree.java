package EA2;

public class TestTree {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(6);
        myTree.insert(5);
        myTree.insert(4);
        myTree.insert(12);
        myTree.insert(11);
        myTree.insert(10);
        myTree.inorder();
    }
}
