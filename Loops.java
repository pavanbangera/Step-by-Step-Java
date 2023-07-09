import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }

        // int i = 0;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }
        // int i = 12;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 11);

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a 'n' numbers");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
