import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(32);
        l1.add(34);
        l1.add(4);
        l1.add(50);
        l1.add(55);

        for (int i = l1.size() - 1; i >= 0; i--) {
            System.out.println(l1.get(i));
        }
    }
}
