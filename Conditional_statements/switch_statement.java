import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        switch (number) {
            case 1: System.out.print("Samosa");
            break;
            case 2: System.out.print("Burger");
            break;
            case 3: System.out.print("Pizza");
            break;
            default : System.out.print("Momos");
        }
    }
}