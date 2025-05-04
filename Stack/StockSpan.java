import java.util.*;

public class StockSpan {

    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currPrince = stock[i];

            while (!s.isEmpty() && currPrince > stock[s.peek()]) {

                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;

            }
            s.push(i);
        }

    }

    public static void printSpan(int[] span) {
        for (int value : span) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int stock[] = { 100, 80, 60, 70, 60, 85, 100 };

        int span[] = new int[stock.length];
        stockSpan(stock, span);
        printSpan(span);

    }
}
