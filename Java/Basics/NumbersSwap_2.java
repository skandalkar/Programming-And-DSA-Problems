
public class NumbersSwap_2 {
    public static void SwapNumbers(int n1, int n2) {
        int temp = n1 + n2;
        n1 = temp - n1;
        n2 = temp - n2;
        System.out.println("n1 = "+n1+" n2 = "+n2);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        SwapNumbers(num1, num2);
    }
}