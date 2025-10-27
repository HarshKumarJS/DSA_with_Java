// This program demonstrates the use of the 'continue' statement in a for loop

public class continue_statement {
    public static void main(String[] args) {

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // If the current number is 3, skip the rest of the loop and move to the next iteration
            if (i == 3) {
                continue;
            }
            else {
                // Print the current number if it's not 3
                System.out.print(i + " ");
            }
        }

        // Move to the next line after printing all numbers
        System.out.println();
    }
}