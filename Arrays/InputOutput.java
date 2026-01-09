import java.util.Scanner; // Import Scanner class for taking user input

public class InputOutput {

    public static void main(String[] args) {

        // Declare an integer array to store marks of subjects
        int[] marks = new int[5];

        // Create Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Take Physics marks as input
        System.out.print("Enter physics marks: ");
        marks[0] = scanner.nextInt();

        // Take Chemistry marks as input
        System.out.print("Enter chemistry marks: ");
        marks[1] = scanner.nextInt();

        // Take Mathematics marks as input
        System.out.print("Enter mathematics marks: ");
        marks[2] = scanner.nextInt();

        // Display the entered marks
        System.out.println("Physics marks: " + marks[0]);
        System.out.println("Chemistry marks: " + marks[1]);
        System.out.println("Mathematics marks: " + marks[2]);

        // Close the Scanner to free system resources
        scanner.close();
    }
}