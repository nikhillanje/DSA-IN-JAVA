public class Bit2 {
    public static void evenOdd(int n) {
        int bitMark = 1;

        if ((n & bitMark) == 0) {
            System.out.println("even");
        } else {

            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        evenOdd(5);
        evenOdd(2);

    }
}
