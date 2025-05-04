import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();

        int ng[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // 1 white
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2if-else

            if (s.isEmpty()) {
                ng[i] = -1;
            } else {
                ng[i] = arr[s.peek()];
            }

            // 3 push in s
            s.push(i);
        }
        for (int i = 0; i < ng.length; i++) {
            System.out.println(ng[i]);

        }
        System.out.println();

    }

}
