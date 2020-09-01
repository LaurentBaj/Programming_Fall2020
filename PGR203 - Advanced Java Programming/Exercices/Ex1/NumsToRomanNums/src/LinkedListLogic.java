public class LinkedListLogic {


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
        current.next = new Node(data);
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
        current.next = current.next.next;
        return;
    }

    public void printAll() {
        Node current;
        for (current = head; current.next != null; current = current.next) {
            System.out.println(current.data);
        }
        System.out.println(current.data);
        return;
    }

    public static void main(String[] args) {
        LinkedListLogic a = new LinkedListLogic();
        a.addToLastElement(2);
        a.addToLastElement(4);
        a.insertAtBeginning(5);
        a.deleteAtSpecificValue(2);
        a.addToLastElement(9);
        a.addToLastElement(9);
        a.addToLastElement(9);
        a.addToLastElement(9);
        a.deleteAtSpecificValue(9);
        a.printAll();
    }
}

