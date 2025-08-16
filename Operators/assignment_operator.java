public class assignment_operator {
    public static void main(String[] args) {

        int a = 4;                         //  Simple assignment operator

        // a = a + 4;
        a += 4;                            //  Addition assignment operator
        System.out.println("a = " + a);

        int b = 5;

        // b = b - 2;
        b -= 2;                            //  Substraction assignment operator
        System.out.println("b = " + b);

        int c = 3;

        // c = c * 2;
        c *= 4;                            //  Multiplication assignment operator
        System.out.println("c = " + c);

        int d = 6;

        // d = d / 2;
        d /= 2;                            // Division assignment operator
        System.out.println("d = " + d);

        int e = 8;

        // e = e % 3;
        e %= 3;                            // Modulo assignment operator
        System.out.println("e = " + e);
    }
}