import java.util.Scanner;

public class divide_two_numbers_from_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int result  = a / b;
        System.out.println("The division of a and b is: " + result);
    }
}