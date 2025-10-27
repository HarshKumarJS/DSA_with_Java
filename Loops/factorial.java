// This program calculates the factorial of a given number using BigInteger
// BigInteger is used to handle very large numbers that cannot fit in int or long

import java.util.*;
import java.math.*;

public class factorial {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        /*
         * Different data types for factorial calculation:
         *
         * int  → works correctly up to 12! (since 13! exceeds int range: 2,147,483,647)
         * long → works correctly up to 20! (since 21! exceeds long range: 9,223,372,036,854,775,807)
         * BigInteger → can handle any large number (no upper limit)
         */

        // int factorial = 1;        // Works only for n <= 12
        // long factorial = 1L;      // Works only for n <= 20
        BigInteger factorial = BigInteger.ONE; // Recommended for large n

        // Loop from 1 to n and multiply each number to get factorial
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        // Display the factorial result
        System.out.println("The factorial of " + n + " is " + factorial);

        // Close the scanner
        scanner.close();
    }
}