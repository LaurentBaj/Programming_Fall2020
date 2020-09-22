public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(27);
        intTree.insert(217);
        intTree.insert(17);
        intTree.insert(107);
        intTree.insert(7);

        intTree.traverseInOrder();
    }
}
