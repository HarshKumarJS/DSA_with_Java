import java.util.*;  // Import Scanner class for user input

public class prime_in_range {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter n: ");

        int n = scanner.nextInt();  // Read integer input from user

        // Call method to print all prime numbers up to n
        Prime_in_range(n);
    }

    // Method to print all prime numbers from 2 to n
    public static void Prime_in_range(int n) {

        for (int i = 2; i <= n; i++) {
            // If current number 'i' is prime, print it
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check whether a number is prime or not
    public static boolean isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        // 2 is a prime number
        else if (n == 2) {
            return true;
        }

        // Check divisibility from 2 up to √n
        else {
            for (int i = 2; i * i <= n; i++) {
                // If divisible by any number, it's not prime
                if (n % i == 0) {
                    return false;
                }
            }
        }

        // If no divisors found, it's prime
        return true;
    }
}