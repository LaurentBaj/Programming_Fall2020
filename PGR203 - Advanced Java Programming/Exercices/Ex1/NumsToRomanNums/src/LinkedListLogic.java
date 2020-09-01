public class LinkedListLogic {
    /* LINKED LIST

    * Data structure where each element is linked to the next one (doubly linked list allows for previous element link)
    * Can contain any datatype, duplicate or unique elements, and can be un/sorted
    * Unlike the array, a linked list has to be traversed in order to retrieve a specific item
            - That takes linear time making it slower then doing the same when we know the index of a value in an array
            - Insertions/deletions can be fast when done from the beginning of a linked list (constant time)
            - Insertions/deletions on the end of a LL demands that we traverse it which is costly (linear time)
    */

    private class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void addToLastElement(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
    }

    public void insertAtBeginning(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteAtSpecificValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
        }
        Node current = head;
        while (current.next.data != data) {
            current = current.next;
        }
        current.next = current.next.next; // The el to the right (i+1) is now next el after that (i+1+1)
        return;                           // (i+1) Will now now a a value but not point to anything (removed from the list)
    }

    public void printAll() {
        for (Node current = head; current.next != null; current = current.next) {
            System.out.println(current.data);
        }
        return;
    }
}
