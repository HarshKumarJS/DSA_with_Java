import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is the largest number");
        }
        else if(a<b){
            System.out.println("b is the largest number");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}