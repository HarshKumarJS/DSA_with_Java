public class PrimeNumber {

    public static void main() {
        // Test the isPrime method
        System.out.println(isPrime(7));
    }

    // Returns true if the given number is prime
    public static boolean isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }

        boolean isPrime = true;

        // Check divisibility up to square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break; // Exit once a divisor is found
            }
        }

        return isPrime;
    }
}