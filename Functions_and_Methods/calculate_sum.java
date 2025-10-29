// Importing the Scanner class from java.util package to take user input
import java.util.*;

public class calculate_sum {

    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter the first number
        System.out.print("Enter a: ");
        int a = scanner.nextInt();  // Reading integer input and storing it in variable 'a'

        // Asking the user to enter the second number
        System.out.print("Enter b: ");
        int b = scanner.nextInt();  // Reading integer input and storing it in variable 'b'

        // Calling the calculate_sum method and storing the returned value in 'sum'
        int sum = calculatesum(a, b);

        // Displaying the result (sum of a and b)
        System.out.println("The sum of a and b is: " + sum);
    }

    // Method to calculate and return the sum of two integers
    public static int calculatesum(int a, int b) {

        int sum = a + b;  // Adding the two numbers
        return sum;       // Returning the result
    }

}