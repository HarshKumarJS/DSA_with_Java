import java.util.Scanner;

public class average_of_three_numbers_with_user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int average = ((a + b + c)/3);

        System.out.println("The average of given numbers is: " + average);
    }
}