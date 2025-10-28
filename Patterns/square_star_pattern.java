// This program prints a square star pattern using nested loops

public class square_star_pattern {
    public static void main(String[] args) {

        // Outer loop controls the number of rows (4 in this case)
        for (int i = 1; i <= 4; i++) {

            // Inner loop prints 4 stars in each row
            // 'j' runs from 1 to 4 — total 4 stars per line
            for (int j = 1; j <= 4; j++) {
                System.out.print("*"); // Print star without moving to a new line
            }

            // Move to the next line after printing all stars in the current row
            System.out.println();
        }
    }
}