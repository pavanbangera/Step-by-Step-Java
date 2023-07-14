public class Recursions {
    public static void printNumber(int n) {
        if (n <= 0) {
            System.out.println("end of the Recursion");
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        printNumber(n);
    }
}