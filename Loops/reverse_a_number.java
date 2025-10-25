// This program reverses and prints the digits of a given number

public class reverse_a_number {
    public static void main(String[] args) {

        // Initialize the number to be reversed
        int n = 12345;

        // Loop runs until n becomes 0
        while (n > 0) {

            // Extract the last digit of n
            int last_digit = n % 10;

            // Print the last digit (without newline)
            System.out.print(last_digit);

            // Remove the last digit from n
            n /= 10;
        }

        // Move to the next line after printing all digits
        System.out.println();
    }
}
