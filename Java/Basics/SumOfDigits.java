// This program calculates the sum of the digits of a given integer.
public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num /= 10;
        }          
        return sum;
    }
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));
    }
}
