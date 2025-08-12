import java.util.Scanner;

public class area_of_circle_with_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        // Use double for higher precision
        double radius = sc.nextDouble();

        // Calculate area using Java's built-in PI constant
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}