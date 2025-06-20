// This code demonstrates how to swap two numbers without using a temporary variable.
// It uses arithmetic operations to achieve the swap.
public class NumbersSwap_3 {
    public static void SwapNumbers(int n1, int n2) {
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("n1 = " + n1 + " n2 = " + n2);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        SwapNumbers(num1, num2);
    }
}