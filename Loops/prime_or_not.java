// This program checks whether a given number is a prime number or not

import java.util.*;

public class prime_or_not {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Case 1: Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            System.out.println("Not a prime number");
        }
        // Case 2: 2 is the smallest and only even prime number
        else if (n == 2) {
            System.out.println("It is a prime number");
        }
        // Case 3: Check divisibility for numbers greater than 2
        else {
            boolean isPrime = true; // Assume the number is prime initially

            // Loop from 2 to the square root of n
            // If any number divides n evenly, it is not a prime
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) { // If n is divisible by i
                    isPrime = false; // Mark as not prime
                    break; // No need to check further, exit the loop
                }
            }

            // After checking all possible divisors, print the result
            if (isPrime) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}