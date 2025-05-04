class PrintAllPermutationString {
    public static void printPerm(String str, String permutation) {

        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i + 1);
            // substring(0, i) = " " of String abc , i=0
            // substring(i + 1); = "bc" of String abc , i=1+1=2 and str[1] = bc
            // newString is = "bc"

            printPerm(newString, permutation + currChar);

        }

    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");

    }
}