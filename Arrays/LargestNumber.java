public class LargestNumber {

    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {2, 1, 6, 3, 19, 4, 7, 12};

        // Print the largest number found in the array
        System.out.println("The largest number of the array is " + largest(arr));
    }

    public static int largest(int[] arr) {

        // Initialize largestNumber with the smallest possible integer value
        int largestnumber = Integer.MIN_VALUE;

        // Traverse the array to find the largest element
        for (int i = 0; i < arr.length; i++) {

            // If current element is greater than largestNumber, update it
            if (largestnumber < arr[i]) {
                largestnumber = arr[i];
            }
        }

        // Return the largest number found
        return largestnumber;
    }
}