import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(1);

        // System.out.println(list.get(3));
        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
