public class BinaryToDecimal {
    public static void main(String[] args) {
        // Convert binary number to decimal
        BinToDec(1010);
    }

    // Converts a binary number to its decimal value
    public static void BinToDec(int n) {

        int mynum = n;  // Store original binary number
        int pow = 0;    // Power of 2
        int dec = 0;    // Decimal result

        while (n > 0) {
            int lastdigit = n % 10;                      // Get last binary digit
            dec += lastdigit * (int) Math.pow(2, pow);
            pow++;
            n /= 10;                                     // Remove last digit
        }

        System.out.println("The decimal number of " + mynum + " is " + dec);
    }
}
