// This program demonstrates the use of the 'break' statement in a do-while loop
// It keeps taking user input until a number that is a multiple of 10 is entered

import java.util.*;

public class break_statement {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Start an infinite loop using do-while
        do {
            // Prompt the user to enter a number
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            // Check if the entered number is a multiple of 10
            if (n % 10 == 0) {
                // If true, display a message and exit the loop using 'break'
                System.out.println("You have entered a multiple of 10, that's why I am leaving. Bye..!");
                break;
            }

            // Print the entered number if it is not a multiple of 10
            System.out.println(n);

        } while (true); // Continue looping until 'break' is executed

        // Print an empty line before the program ends
        System.out.println();
    }
}