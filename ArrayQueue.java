
public class ArrayQueue {

    static class Queue {
        static int arr[];
        static int rear = -1;
        static int size;

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        static boolean isEmpty() {
            return rear == -1;
        }

        static boolean isFull() {
            return rear == size - 1;
        }

        static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}