import java.util.*;  // Importing utility package to use Scanner class

public class findfactorial {

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter n: ");
        int n = scanner.nextInt();  // Read the integer input

        // Call the find_factorial method and store the result
        int factorial = find_factorial(n);

        // Display the factorial result
        System.out.println("The factorial of " + n + " is " + factorial);
    }

    // Method to calculate factorial of a given number n
    public static int find_factorial(int n) {

        int factorial = 1;  // Initialize factorial as 1

        // Multiply numbers from 1 to n to compute factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Return the calculated factorial
        return factorial;
    }
}