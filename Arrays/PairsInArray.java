public class PairsInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print all unique pairs in the array
        PrintPairs(arr);
    }

    public static void PrintPairs(int[] arr) {

        int totalpairs = 0;  // Counter to track number of pairs

        // Fix first element of the pair
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            // Pair it with remaining elements
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + ", " + arr[j] + ") ");
                totalpairs++;
            }

            System.out.println();  // Move to next line after each outer loop iteration
        }

        // Print total number of unique pairs
        System.out.println("Total pairs: " + totalpairs);
    }
}