public class Addition {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 5, 6, 7, 8 };

        // Check if both arrays have the same length
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length.");
            return;
        }

        // Create an array to store the result
        int[] result = new int[array1.length];

        // Add the arrays element-wise
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        // Print the result
        System.out.print("Resulting Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

}
