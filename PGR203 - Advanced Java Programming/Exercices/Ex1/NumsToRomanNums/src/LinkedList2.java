import org.w3c.dom.Node;

public class LinkedList2 {

    private class Node {
        int item;
        Node next;

       /* public Node (int item) {
            this.item = item;
        }*/
    }

    Node head, current;

    void append(int item) {
        if (head == null) {
            head = new Node();
            head.item = item;
            return;
        }
        current = head;

        while (current.next != null) {
            current = current.next;
        }
        Node lastItem = new Node();
        lastItem = current.next;
        lastItem.item = item;
    }

    void prepend(int item) {
        if (head == null) {
            head = new Node();
            head.item = item;
            return;
        }

        Node newHead = new Node();
        newHead.item = item;
        head = newHead;
        newHead = head.next;
    }

    void deleteSpecItem(int item) {
        if (head == null) return;
        if (head.item == item) {
            head = head.next;
        }

        current = head;

        while (current.next.item != item) {
            current = current.next;
        }
        current.next = current.next.next;
        return;
    }

    int getItem(int item) {
        current = head;
        if(current.item != item) current = current.next;
        return current.item;
    }
}
