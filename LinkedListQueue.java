public class LinkedListQueue {

    static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty() {
            return head == null && tail == null;
        }

        static void add(int data) {
            Node newNode = new Node(data);
            if (head == null && tail == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            // single node
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;

        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());

    }
}
