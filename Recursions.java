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

    public static int calcFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factNxt = calcFact(n - 1);
        int fact = n * factNxt;
        return fact;
    }

    public static void calcFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        calcFibo(b, c, --n);
    }

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int calcNm1 = calcPower(x, n - 1);
        // return x * calcNm1;
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        // printNumber(n);
        // printSum(1, n, 0);
        // int p = calcFact(n);
        // System.out.println(p);
        // int a = 0, b = 1;
        // System.out.print(a + " " + b + " ");
        // calcFibo(a, b, n - 2);

        System.out.println(calcPower(2, 10));
    }
}