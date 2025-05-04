public class SandL {
    public static void getlargest(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest Value Is " + largest);
        System.out.println("Smallest Value Is " + smallest);
    }

    public static void main(String[] args) {

        int numbers[] = { -110, -50, 100, 100, 90000 };

        getlargest(numbers);

    }

}
