// This program prints a character (alphabet) pattern using nested loops

public class character_pattern {
    public static void main(String[] args) {

        // Outer loop controls the number of rows (4 in this case)
        for (int i = 1; i <= 4; i++) {

            // Inner loop prints characters from 'A' up to ('A' + i - 1)
            // For example:
            // i = 1 → A
            // i = 2 → AB
            // i = 3 → ABC
            // i = 4 → ABCD
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print(j); // Print character without moving to next line
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}