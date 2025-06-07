// This program calculates the sum of all numbers from 1 to a given number.
public class SumOfNumbers {
    public static int sumOfNumbers(int num) {
        int sum = 0;

        /*
         * This is simple iterative approach to calculate the sum, not optimized.
         * for(int i = 1; i <= num; i++) {
         * sum += i;
         * }
         */
        return sum = (num * (num + 1) / 2); // Using the formula n(n+1)/2 to calculate the sum of first n natural
                                            // numbers
    }

    public static void main(String[] args) {
        int range = 15;
        System.out.println(sumOfNumbers(range));
    }
}