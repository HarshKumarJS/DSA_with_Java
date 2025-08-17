import java.util.Scanner;

public class pass_or_fail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        String result = (marks>=33) ? "Congratulations, You cleared the exam." : "Unfortunately, you failed the exam.";
        System.out.println(result);
    }
}