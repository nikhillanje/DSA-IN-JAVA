public class Subsequent {

    public static void subsequent(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        subsequent(str, idx + 1, newString + currChar);
        subsequent(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequent(str, 0, "");
    }
}
