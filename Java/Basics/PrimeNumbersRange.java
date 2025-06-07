// This Java program prints all prime numbers in a specified range.
public class PrimeNumbersRange {

    public static void printPrimeNumbers(int start, int end) {
        System.out.println("Prime numbers from " + start + " to " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if(num <= 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 50;
        printPrimeNumbers(start, end);
    }
}
