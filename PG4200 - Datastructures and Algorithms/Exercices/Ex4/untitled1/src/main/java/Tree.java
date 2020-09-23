public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) root = new TreeNode(value);
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) return subtreeRoot;
        if (value < subtreeRoot.getData()) subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        else
        if (value > subtreeRoot.getData()) subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        else {
            // Case: Node to delete has zero or one children
            if (subtreeRoot.getLeftChild() == null) return subtreeRoot.getRightChild();
            else
            if (subtreeRoot.getRightChild() == null) return subtreeRoot.getLeftChild();
            // Case: Node has two children
            subtreeRoot.setData(subtreeRoot.getRightChild().min()); // Replace the node we wish to delete() with the smallest value in subtree

            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData())); // Delete node
        }
        return subtreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return root.min();
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return root.max();
    }
}
