// This program prints an inverted right-angled triangle star pattern using nested loops

public class inverted_star_pattern {
    public static void main(String[] args) {

        // Outer loop controls the number of rows (4 in this case)
        for (int i = 1; i <= 4; i++) {

            // Inner loop prints stars in decreasing order
            // For each new row, the number of stars decreases by one
            for (int j = 4; j >= i; j--) {
                System.out.print("*"); // Print star without moving to the next line
            }

            // Move to the next line after printing all stars in the current row
            System.out.println();
        }
    }
}