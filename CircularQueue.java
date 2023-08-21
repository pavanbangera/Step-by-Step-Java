public class CircularQueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        static boolean isFull() {
            return (rear + 1) % size == front;
        }

        static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (isEmpty()) {
                ++front;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int res = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        q.add(6);
        q.add(7);

        System.out.println(q.peek());

    }
}
