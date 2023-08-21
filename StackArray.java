public class StackArray {

    static class Stack {
        static int arr[];
        static int size;
        static int top = -1;

        Stack(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        static boolean isEmpty() {
            return top == -1;
        }

        static boolean isFull() {
            return top == size - 1;
        }

        static void push(int data) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[++top] = data;

        }

        static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top--];
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.pop());
        s.push(8);
        System.out.println(s.peek());

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        s.pop();
    }
}
