public class LinearSearchString {

    public static int linearSearch(String name, char key) {

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String name = "NIKHIL";

        char key = 'H';

        int index = linearSearch(name, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key at index " + index);
            System.out.println("key at position " + (index + 1));
        }
    }
}
