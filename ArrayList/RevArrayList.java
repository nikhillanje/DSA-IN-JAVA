import java.util.ArrayList;

public class RevArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(1);

        // System.out.println(list.get(3));
        // System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
}
