import java.util.LinkedList;

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

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nxtNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nxtNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public void nthDeleteEnd(int n) {
        if (head.next == null) {
            head = null;
        }
        if (n == size) {
            size--;
            head = head.next;
        } else {

            Node currNode = head;
            int i = 1;
            while (i < (size - n)) {
                currNode = currNode.next;
                i++;
            }
            currNode.next = currNode.next.next;
            size--;
        }

    }

    public Node firstHalf(Node head) {
        Node turtle = head;
        Node hare = head;

        while (hare.next != null && hare.next.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        return turtle;
    }

    public Node secondHalf(Node head) {
        Node prev = null;
        Node curr = head.next;

        while (curr != null) {
            Node nxt = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node firstHalf = firstHalf(head);
        Node secondHalf = secondHalf(firstHalf.next);

        Node first = head;
        while (secondHalf != null) {
            if (first.data != secondHalf.data) {
                return false;
            }
            first = first.next;
            secondHalf = secondHalf.next;
        }
        return true;
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
        // LL.print();
        // LL.addFirst("b");
        // LL.print();
        // LL.addFirst("a");
        // LL.print();
        // LL.addLast("c");
        // LL.print();
        // LL.addLast("d");
        // LL.print();
        // LL.reverseList();
        // LL.print();
        // LL.addFirst("e");
        // LL.print();
        // LL.reverseList();
        // LL.print();
        // LL.head = LL.reverseRecursion(LL.head);
        // LL.print();
        // LL.nthDeleteEnd(2);
        // LL.print();

        LL.addFirst("a");
        LL.addFirst("b");
        LL.addFirst("c");
        LL.addFirst("b");
        LL.addFirst("a");
        LL.print();
        boolean c = LL.isPalindrome(LL.head);
        System.out.println(c);

        // LinkedList<String> list = new LinkedList<>();
        // System.out.println(list);
        // list.add("c");
        // list.addFirst("b");
        // list.addFirst("a");
        // list.addLast("d");
        // System.out.println(list + " " + list.size());
        // for (String string : list) {
        // System.out.println(string);
        // }

    }
}
