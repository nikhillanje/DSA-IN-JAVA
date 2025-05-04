public class TilesQuestion {
    public static int placeTiles(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // vertically
        int vericallyPlacement = placeTiles(n - m, m);

        // horizontally
        int horizontallyPlacement = placeTiles(n - 1, m);

        return vericallyPlacement + horizontallyPlacement;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;

        int totalWays = placeTiles(n, m);

        System.out.println(totalWays);

    }
}
