// This program checks if a given number is a palindrome or not.
// A palindrome is a number that remains the same when its digits are reversed.

public class PalindromeOrNot {
    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return temp == rev; // return true if original number equals reversed number
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }
}