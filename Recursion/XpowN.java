public class XpowN {
    public static int printPw(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xPownm1 = printPw(x, n - 1);
        int xPown = xPownm1 * x;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        int ans = printPw(x, n);
        System.out.println(ans);
    }
}
