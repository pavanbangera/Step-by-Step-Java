import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.set(1, 2);
        System.out.println(list);
        list.set(1, 6);
        list.add(1, 1);
        System.out.println(list);
        System.out.println(list.size());

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

}