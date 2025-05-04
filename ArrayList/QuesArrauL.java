import java.util.ArrayList;

public class QuesArrauL {

    public static int storedWater(ArrayList<Integer> heihgt) {
        int maxWater = 0;

        for (int i = 0; i < heihgt.size(); i++) {
            for (int j = 1; i < heihgt.size(); j++) {
                int ht = Math.min(heihgt.get(i), heihgt.get(j));

                int width = j - 1;
                int currWater = ht * width;

                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println();

    }

}
