import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("find a number from array ");
        int f = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (f == numbers[i]) {
                System.out.println(f + " found at the index of " + i);
                break;
            }
        }

    }
}