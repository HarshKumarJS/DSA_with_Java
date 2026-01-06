public class BinaryToDecimal {

    public static void main(String[] args) {
        BinToDec(1010);
        BinToDec(0);
        BinToDec(-101);
    }

    // Converts a binary number to its decimal value
    public static void BinToDec(int n) {

        // Handle zero explicitly
        if (n == 0) {
            System.out.println("The decimal number of 0 is 0");
            return;
        }

        boolean isNegative = n < 0;
        n = Math.abs(n);

        int mynum = n;  // Store original binary number
        int pow = 0;    // Power of 2
        int dec = 0;    // Decimal result

        while (n > 0) {
            int lastdigit = n % 10;
            dec += lastdigit * (int) Math.pow(2, pow);
            pow++;
            n /= 10;
        }

        if (isNegative) {
            System.out.println("The decimal number of -" + mynum + " is -" + dec);
        } else {
            System.out.println("The decimal number of " + mynum + " is " + dec);
        }
    }
}
