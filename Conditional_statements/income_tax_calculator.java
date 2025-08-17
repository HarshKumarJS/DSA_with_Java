import java.util.Scanner;

public class income_tax_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        if(income<500000){
            System.out.println("The tax on your income is 0%");
            System.out.println("Your in-hand salary is: " + income);
        }
        else if(income>=500000 && income<1000000){
            System.out.println("The tax on your income is 20%");
            double tax = ((income*20)/100);
            double In_hand = income - tax;
            System.out.println("Your in-hand salary is: " + In_hand);
        }
        else{
            System.out.println("The tax on your income is 30%");
            double tax = ((income*30)/100);
            double In_hand = income - tax;
            System.out.println("Your in-hand salary is: " + In_hand);
        }
        sc.close();
    }
}