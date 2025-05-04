import java.util.ArrayList;

public class SwapArrayList {

    public static void swap(ArrayList<Integer> l1, int idx1, int idx2) {

        int temp = l1.get(idx1);
        l1.set(idx1, l1.get(idx2));
        l1.set(idx2, temp);

    }

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(32);
        l1.add(34);
        l1.add(4);
        l1.add(50);
        l1.add(55);

        int idx1 = 1;
        int idx2 = 3;
        System.out.println("without swapped");
        System.out.println(l1);
        swap(l1, idx1, idx2);

        System.out.println("with swapped");

        System.out.println(l1);

    }
}
