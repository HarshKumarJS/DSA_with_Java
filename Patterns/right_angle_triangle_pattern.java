// This program prints a right-angled triangle star pattern using nested loops

public class right_angle_triangle_pattern {
    public static void main(String[] args) {

        // Outer loop controls the number of rows (4 in this case)
        for (int i = 1; i <= 4; i++) {

            // Inner loop controls the number of stars printed in each row
            // It runs 'i' times, so the number of stars increases each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star without moving to the next line
            }

            // Move to the next line after printing all stars in the current row
            System.out.println();
        }
    }
}