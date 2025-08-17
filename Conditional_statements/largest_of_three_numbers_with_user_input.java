import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        }
        else if (a >= b && a >= c && a == b) {
            System.out.println("a and b are equal and largest");
        }
        else if (a >= b && a >= c && a == c) {
            System.out.println("a and c are equal and largest");
        }
        else if (b >= a && b >= c && b == c) {
            System.out.println("b and c are equal and largest");
        }
        else if (a >= b && a >= c) {
            System.out.println("a is the largest number");
        }
        else if (b >= a && b >= c) {
            System.out.println("b is the largest number");
        }
        else {
            System.out.println("c is the largest number");
        }
    }
}
