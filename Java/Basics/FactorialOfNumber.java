// This program calculates the factorial of a given number using a for loop.
// It throws an exception if the input number is less than or equal to 0.
public class FactorialOfNumber {

    public static long factorialOfNumber(int num) {
        long factorial = 1;
        if (num <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else {

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 6;
        long result = factorialOfNumber(number);
        System.out.println("Factorial of " + number + " is: " + result);

    }
}