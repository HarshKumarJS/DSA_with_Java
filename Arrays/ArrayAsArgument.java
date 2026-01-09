public class ArrayAsArgument {

    public static void main(String[] args) {

        // Primitive variable (passed by value)
        int unchange = 5;

        // Integer array (reference is passed to methods)
        int[] marks = {95, 96, 97};

        // Pass array and primitive variable to update method
        update(marks, unchange);

        // Print updated array values
        print(marks);

        // Print primitive variable to show it remains unchanged
        System.out.println("This remains unchanged: " + unchange);
    }

    // Method to demonstrate how arrays and primitives behave when passed as arguments
    public static void update(int[] marks, int unchange) {

        // This change will NOT affect the original variable in main()
        // because primitive types are passed by value
        unchange = 8;

        // Updating array elements using indexing
        // Changes will reflect in main() because array reference is passed
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    // Method to print array elements using loop
    public static void print(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Updated marks: " + marks[i]);
        }
    }
}