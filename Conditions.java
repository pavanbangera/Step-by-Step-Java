import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether given number is even or odd");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even");

        } else {
            System.out.println(a + " is odd");
        }
    }
}
