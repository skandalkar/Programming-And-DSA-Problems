// This program checks if a number is an Armstrong number or not.
// An Armstrong number (or narcissistic number) for a given number of digits is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
public class ArmstrongOrNot {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // number of digits

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        return sum == originalNum; // return true if sum of digits raised to the power of number of digits equals
                                   // original number

    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println(isArmstrong(number));
    }
}
