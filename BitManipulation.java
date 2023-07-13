public class BitManipulation {

    public static void getBit(int i, int j) {
        int n = i;
        int pos = j;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

    }

    public static void setBit(int i, int j) {
        int n = i;
        int pos = j;
        int bitMask = 1 << pos;
        int newBit = bitMask | n;
        System.out.println(newBit);

    }

    public static void main(String[] args) {
        // getBit(5, 2);
        setBit(5, 1);
    }
}
