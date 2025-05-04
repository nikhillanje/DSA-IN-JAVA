
public class GetIthBit {

    public static int getIthBit(int n, int i) {

        int bitmark = 1 << i;

        if ((n & bitmark) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int ans = getIthBit(10, 2);
        System.out.println(ans);
    }

}
