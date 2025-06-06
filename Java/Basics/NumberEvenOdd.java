
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