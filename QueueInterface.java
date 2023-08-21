import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
