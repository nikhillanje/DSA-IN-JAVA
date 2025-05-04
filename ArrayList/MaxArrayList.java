import java.util.ArrayList;

public class MaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(32);
        l1.add(34);
        l1.add(4);
        l1.add(50);
        l1.add(55);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < l1.size(); i++) {
            // if (max < l1.get(i)) {
            // max = l1.get(i);
            // }

            // OR

            max = Math.max(max, l1.get(i));

        }
        System.out.println(max);
    }
}
