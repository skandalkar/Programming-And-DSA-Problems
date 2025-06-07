// This code checks if a number is prime or not.
// A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers.
public class NumberPrimeOrNot {
    public static boolean checkNumber(int num) {
        if (num <= 1) {
            return false; // 0 & 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // if number is divisible by any number other than 1 & itself, it is not prime
            }
        }

        return true; // if no divisors, it is prime
    }

    public static void main(String[] args) {
        int number = 29;
        System.out.println(checkNumber(number));
    }
}