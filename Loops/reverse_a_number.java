/**
 * Reverses a positive integer by extracting digits from right to left and reconstructing them in reverse order.
 */
public class reverse_a_number {
    public static void main(String[] args) {
        // Input integer to be reversed (must be non-negative for this loop condition)
        int number = 35984;

        // Accumulator for the reversed digits
        int reversed_number = 0;

        // Process digits until no digits remain in `number`
        while (number > 0) {
            // Extract the rightmost (least significant) digit using modulo 10
            int lastdigit = number % 10;

            // Shift existing reversed digits left by one base-10 place and append the new digit
            reversed_number = (reversed_number * 10) + lastdigit;

            // Drop the rightmost digit via integer division
            number /= 10;
        }

        // Output the final reversed number
        System.out.println("The reverse of given number is: " + reversed_number);
    }
}
