import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(32);
        l1.add(34);
        l1.add(4);
        l1.add(50);
        l1.add(55);

        System.out.println(l1);
        System.out.println();
        System.out.println(l1.get(4));
        System.out.println();
        int element = l1.get(1);
        System.out.println(element);
        System.out.println();
        // l1.remove(4);

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

    }
}
