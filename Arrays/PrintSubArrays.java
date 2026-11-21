public class PrintSubArrays {

    public static void main(String[] args) {

        // Sample array used to demonstrate printing all contiguous subarrays.
        int[] numbers = {1, 2, 3, 4, 5};

        printsubarrays(numbers);

    }

    // Prints every non-empty contiguous subarray of the given array.
    public static void printsubarrays (int[] numbers) {

        // Choose the starting index of each subarray.
        for (int i = 0; i < numbers.length; i++){

            // Choose the ending index; starting at i includes single-element subarrays.
            for (int j = i ; j < numbers.length; j++){

                // Print all elements between the start and end indices, inclusive.
                for (int k = i; k <= j; k++){
                    System.out.print(numbers[k] + " ");
                }

                System.out.println();

            }

            // Separate groups of subarrays that share the same starting index.
            System.out.println();

        }
    }
}