import java.util.ArrayList;

public class MaxElemArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(100);

        // System.out.println(list.get(3));
        // System.out.println(list);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
}
