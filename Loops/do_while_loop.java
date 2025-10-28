// This program demonstrates the use of a do-while loop in Java

public class do_while_loop {
    public static void main(String[] args) {

        // Initialize the counter variable
        int i = 1;

        // The do-while loop will always run the body once before checking the condition
        do {
            // Print the message
            System.out.println("Hello World..!");
            // Increment the counter
            i++;
        } while (i <= 5);   // The loop continues while i is less than or equal to 5
        // This will print "Hello World..!" 5 times as expected

        // Example explanation:
        // If you use the condition (i >= 1) instead, it will still print once even though
        // the condition is false from the beginning, because in a do-while loop, 
        // the body executes first and the condition is checked afterward.
    }
}