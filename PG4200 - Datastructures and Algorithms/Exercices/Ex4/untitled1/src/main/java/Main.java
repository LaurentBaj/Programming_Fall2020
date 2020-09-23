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

        System.out.println("");

        System.out.println(intTree.get(20));
        System.out.println(intTree.get(107));
        System.out.println(intTree.get(217));
        System.out.println(intTree.get(24));

        System.out.println("");

        System.out.println(intTree.min());
        intTree.delete(217);
        System.out.println(intTree.max());
    }
}
