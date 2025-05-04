import java.util.*;

public class Array_List1 {
    public static void main(String args[]) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(4);

        l2.add(15);
        l2.add(18);
        l2.add(50);

        l1.add(6);
        l1.add(5);
        l1.add(10);

        l1.add(1, 100); // print 6 100 5 10

        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(l2);

        // l1.clear();

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

    }
}

// add(n) , get(i) , size() ----> Methods of ArrayList