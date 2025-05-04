public class ClearRangeBit {
    public static int clearBit(int n, int i, int j) {
        int a = ((~0) << (j + 1));

        int b = (1 << i) - 1;

        int bitmark = a | b;

        return n & bitmark;
    }

    public static void main(String[] args) {
        System.out.println(clearBit(10, 02, 04));
    }
}
