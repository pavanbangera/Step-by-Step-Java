import java.util.Scanner;

class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd value");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
        sc.close();
    }
}