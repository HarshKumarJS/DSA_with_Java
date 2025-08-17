import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter the operation (+, -, *, /, %): ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+': System.out.println("The sum of a and b is: " + (a + b));
            break;
            case '-': System.out.println("The difference of a and b is: " + (a - b));
            break;
            case '*': System.out.println("The product of a and b is: " + (a * b));
            break;
            case '/':
                if (b != 0) {
                    System.out.println("The division of a and b is: " + ((double) a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("The remainder when a is divided by b is: " + (a % b));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default: System.out.println("Invalid operation entered.");
        }
    }
}
