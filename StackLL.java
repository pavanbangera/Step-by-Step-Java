public class StackLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }

        public static int pop() {
            if (head == null) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (head == null) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {

        Stack.push(0);
        Stack.push(1);
        Stack.push(2);
        System.out.println(Stack.peek());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        Stack.push(2);
        System.out.println(Stack.peek());

    }
}
