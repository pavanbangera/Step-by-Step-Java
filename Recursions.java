public class Recursions {
    public static void printNumber(int n) {

        if (n <= 0) {
            System.out.println("end of the Recursion");
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 5;
        // printNumber(n);
        printSum(1, n, 0);
    }
}