
public class ArrayAsArg {
    public static void updateArr(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String[] args) {

        int marks[] = { 4, 5, 7, 3, 6, 3 };

        updateArr(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }

}
