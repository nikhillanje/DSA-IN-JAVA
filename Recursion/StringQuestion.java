/* any string is given we track an element is 
1st occurs in string and last occurs in string 
print its indexes */

public class StringQuestion {
    public static int first = -1;
    public static int last = -2;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);

    }

    public static void main(String[] args) {
        String str = "abcdcajfjfdj";
        findOccurance(str, 0, 'd');

    }
}
