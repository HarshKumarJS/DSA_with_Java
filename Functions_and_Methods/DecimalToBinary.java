public class DecimalToBinary {

    // Converts a decimal number to its binary representation
    public static void DecToBin(int decNum) {

        // Handle zero explicitly
        if (decNum == 0) {
            System.out.println("Binary number of 0 is 0");
            return;
        }

        boolean isNegative = decNum < 0;
        decNum = Math.abs(decNum);

        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum += remainder * (int) Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }

        // Print result with sign if original number was negative
        if (isNegative) {
            System.out.println("Binary number of -" + myNum + " is -" + binNum);
        } else {
            System.out.println("Binary number of " + myNum + " is " + binNum);
        }
    }

    public static void main(String[] args) {
        DecToBin(5);
        DecToBin(0);
        DecToBin(-7);
    }
}