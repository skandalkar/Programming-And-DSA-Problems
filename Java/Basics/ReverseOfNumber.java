public class ReverseOfNumber {
    public static int reverseOfNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reversed number of " + num + " is: " + reverseOfNumber(num));
    }
}