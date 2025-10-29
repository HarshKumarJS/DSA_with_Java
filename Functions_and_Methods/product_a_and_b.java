import java.util.*;
// Importing the Java utility package to use the Scanner class for user input

public class product_a_and_b {
    // Main class named 'product_a_and_b'

    public static void main(String[] args){
        // The main method — program execution starts from here

        Scanner scanner = new Scanner(System.in);
        // Creating a Scanner object to take input from the user

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        // Taking integer input for variable 'a' from the user

        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        // Taking integer input for variable 'b' from the user

        int product = calculate_product(a, b);
        // Calling the 'calculate_product' method and storing the result in 'product'

        System.out.println("Product of a and b is: " + product);
        // Displaying the product of 'a' and 'b' on the screen
    }

    public static int calculate_product(int a, int b){
        // Method to calculate and return the product of two integers

        int product = a * b;
        // Multiplying 'a' and 'b' and storing the result in 'product'

        return product;
        // Returning the calculated product to the main method
    }
}