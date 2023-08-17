public class LList {
    Node head;
    private int size = 0;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public void print() {

        Node current = head;
        if (head == null) {
            System.out.println("Null");
            return;
        }
        while (current != null) {
            System.err.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("null [ " + size + " ]");
        System.out.println();
    }

    public static void main(String[] args) {
        LList LL = new LList();
        LL.print();
        LL.addFirst("b");
        LL.print();
        LL.addFirst("a");
        LL.print();
        LL.addLast("c");
        LL.print();
        LL.addLast("d");
        LL.print();
        LL.deleteFirst();
        LL.print();
        LL.deleteFirst();
        LL.print();
        LL.deleteLast();
        LL.print();
        LL.deleteLast();
        LL.print();

    }
}
