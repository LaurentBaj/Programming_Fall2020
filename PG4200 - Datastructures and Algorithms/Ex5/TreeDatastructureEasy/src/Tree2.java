public class Tree2 {
    Tree2 left, right;
    int data;
    public Tree2(int value) {
        this.data = value;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Tree2(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Tree2(value);
            } else {
                right.insert(value);
            }
        }
    }

}
