import java.util.*;

public class Conditions {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Check whether given number is even or odd");
        // int a = sc.nextInt();
        // if (a % 2 == 0) {
        // System.out.println(a + " is even");

        // } else {
        // System.out.println(a + " is odd");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any number from 1,2,3");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Haii");
                break;
            case 2:
                System.out.println("Hellow");
                break;
            case 3:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
