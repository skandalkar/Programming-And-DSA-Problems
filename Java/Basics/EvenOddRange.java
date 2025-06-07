// This Java program prints all even and odd numbers in a specified range.

public class EvenOddRange {
    public static void printEvenOddRange(int start, int end) {
        System.out.println("Even numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        printEvenOddRange(start, end);
    }

}
