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

    public static void towerOfHanoi(int n, char src, char hlpr, char dest) {
        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, hlpr);
        System.out.println("tranfred " + n + " " + src + " -> " + dest);
        // towerOfHanoi(1, src, hlpr, dest);
        towerOfHanoi(n - 1, hlpr, src, dest);
    }

    public static void reverseString(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str, --index);
    }

    public static int first = -1, last = -1;

    public static void findCharPosition(String str, int index, char elem) {
        if (index == str.length()) {
            if (last < first)
                last = first;
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (elem == str.charAt(index)) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findCharPosition(str, ++index, elem);
    }

    public static boolean checkSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            return false;
        } else {
            return checkSorted(arr, ++index);
        }
    }

    public static int count = 0;
    public static StringBuilder sb = new StringBuilder("");

    public static void moveAllX(String str, int index, char elem) {
        if (index == str.length()) {
            for (int i = 1; i <= count; i++) {
                sb.append(elem);
            }
            System.out.println(sb);
            return;
        }
        if (elem == str.charAt(index)) {
            ++count;
        } else {
            sb.append(str.charAt(index));
        }
        moveAllX(str, ++index, elem);
    }

    public static StringBuilder sb1 = new StringBuilder("");
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int index) {
        if (index == str.length()) {
            System.out.println(sb1);
            return;
        }
        char curChar = str.charAt(index);
        if (map[curChar - 'a'] != true) {
            map[curChar - 'a'] = true;
            sb1.append(curChar);
        }
        removeDuplicates(str, ++index);
    }

    public static void main(String[] args) {
        // int n = 4;
        // printNumber(n);
        // printSum(1, n, 0);
        // int p = calcFact(n);
        // System.out.println(p);
        // int a = 0, b = 1;
        // System.out.print(a + " " + b + " ");
        // calcFibo(a, b, n - 2);

        // System.out.println(calcPower(2, 10));

        // int n = 3;
        // towerOfHanoi(n, 'A', 'B', 'C');

        // String str = "pavan kumar k";
        // reverseString(str, str.length() - 1);

        // findCharPosition("pavan kumar k", 0, 'a');
        // int arr[] = { 1, 2, 2, 4, 5 };
        // System.out.println(checkSorted(arr, 0));

        // moveAllX("axbxcxxdxx", 0, 'x');

        removeDuplicates("abbcddde", 0);

    }
}