public class ReverseAnArray {

    public static void main(String[] args) {

        // Initialize the array to be reversed
        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        // Call the reverse method (modifies the same array in-place)
        reverse(arr);

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr) {

        // Defensive check: if array is null or has 0/1 element, no action needed
        if (arr == null || arr.length <= 1) {
            return;
        }

        // Initialize two pointers:
        // start at the beginning, end at the last index
        int start = 0;
        int end = arr.length - 1;

        // Continue swapping until the pointers meet or cross
        while (start < end) {

            // Store the start element temporarily
            int temp = arr[start];

            // Replace start element with end element
            arr[start] = arr[end];

            // Replace end element with the stored start element
            arr[end] = temp;

            // Move the pointers inward
            start++;
            end--;
        }
    }
}