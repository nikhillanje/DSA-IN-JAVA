import java.util.*;

public class MultiDimenArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(4);
        list.add(1);
        list.add(4);

        list2.add(10);
        list2.add(12);
        list2.add(14);
        list2.add(15);
        list2.add(19);
        list2.add(30);

        mainList.add(list);
        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++) {

            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.println(currList.get(j) + " ");
            }
            System.out.println();

        }

    }

}
