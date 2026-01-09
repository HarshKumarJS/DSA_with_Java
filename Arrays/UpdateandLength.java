import java.util.Scanner; // Import Scanner class for taking user input

public class UpdateandLength {

    public static void main(String[] args) {

        // Declare an integer array to store marks of subjects
        // Array size is fixed to 5 elements
        int[] marks = new int[5];

        // Create Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Take Physics marks as input and store at index 0
        System.out.print("Enter physics marks: ");
        marks[0] = scanner.nextInt();

        // Take Chemistry marks as input and store at index 1
        System.out.print("Enter chemistry marks: ");
        marks[1] = scanner.nextInt();

        // Take Mathematics marks as input and store at index 2
        System.out.print("Enter mathematics marks: ");
        marks[2] = scanner.nextInt();

        // Display the entered marks using array indexing
        System.out.println("Physics marks: " + marks[0]);
        System.out.println("Chemistry marks: " + marks[1]);
        System.out.println("Mathematics marks: " + marks[2]);

        // Update the value at index 2 (Mathematics marks)
        marks[2] = 98;

        // Alternative way to update array value using arithmetic operation
        // marks[2] = marks[2] + 3;

        // Display updated mathematics marks
        System.out.println("Updated mathematics marks: " + marks[2]);

        // Display the length of the array using length property
        // length gives total number of elements in the array
        System.out.println("Length of array(marks): " + marks.length);

        // Close the Scanner to free system resources
        scanner.close();
    }
}
