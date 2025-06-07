// This code checks if a number is even or odd.
// An even number is an integer that is exactly divisible by 2, while an odd number is not.
public class NumberEvenOdd {

    public static boolean CheckEvenOdd(int num) {
        boolean isEven = false;

        if (num % 2 == 0) {
            isEven = true; // even
        } else {
            return isEven; // odd
        }

        return isEven; // default odd
    }

    public static void main(String[] args) {
        int number = 22;
        System.out.println(CheckEvenOdd(number));

    }
}