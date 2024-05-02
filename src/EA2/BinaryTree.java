package EA2;

public class BinaryTree {
    private BinaryNode root;

    public BinaryTree(int value) {
        root = new BinaryNode(value);
    }

    public BinaryTree() { }

    public boolean contains(int value) { 
        if (root == null) return false;
        BinaryNode currentNode = root;
        while (currentNode.value != value) {
            if (value < currentNode.value) {
                if (currentNode.leftSon == null) return false;
                currentNode = currentNode.leftSon;
            }
            else {
                if (currentNode.rightSon == null) return false;
                currentNode = currentNode.rightSon;
            }
        }
        return true;
    }

    public void insert(int value) { 
        if (root == null) {
            root = new BinaryNode(value);
            return;
        }
        if (this.contains(value)) return;
        BinaryNode currentNode = root;
        while (true) {
            if (value < currentNode.value) {
                if (currentNode.leftSon == null) {
                    currentNode.leftSon = new BinaryNode(value);
                    break;
                }
                currentNode = currentNode.leftSon;
            }
            else {
                if (currentNode.rightSon == null) {
                    currentNode.rightSon = new BinaryNode(value);
                    break;
                }
                currentNode = currentNode.rightSon;
            }
        }
    }

    public void inorder() { 
        // Prints from root to leafs, left to right (preorder)
        if (root == null) return;
        this.inorder(root);
    }

    private void inorder(BinaryNode currentNode) {
        System.out.println(currentNode.value);
        if (currentNode.leftSon != null) {
            this.inorder(currentNode.leftSon);
        }
        if (currentNode.rightSon != null) {
            this.inorder(currentNode.rightSon);
        }
    }

    private static class BinaryNode {
        private BinaryNode leftSon, rightSon;
        private int value;

        public BinaryNode(int value) {
            this.value = value;
        }
    }
}
