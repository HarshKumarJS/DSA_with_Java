import java.util.Scanner;

public class subtract_two_numbers_from_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int difference  = a - b;
        System.out.println("The difference of a and b is: " + difference);
    }
}