public class decrement_operator {
    public static void main(String[] args) {

        int a = 2;
        int b = --a;  //  pre - decrement

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 5;
        int d = c--;  //  post - decrement

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}