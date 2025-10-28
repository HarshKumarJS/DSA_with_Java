// This program prints a character pattern with non-repeating alphabets

public class character_pattern {
    public static void main(String[] args) {

        // Initialize the starting character
        char ch = 'A';

        // Define the number of rows to print
        int n = 6;

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop prints characters in each row
            // The number of characters in each row equals the row number
            for (int j = 1; j <= i; j++) {
                System.out.print(ch); // Print the current character
                ch++; // Move to the next alphabet (non-repeating)
            }

            // Move to the next line after printing all characters of the current row
            System.out.println();
        }
    }
}