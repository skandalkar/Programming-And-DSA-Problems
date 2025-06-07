// Description: This program prints the multiplication table of a given number.
public class TableOfNumber {
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        int number = 5; 
        printTable(number);
    }
}
