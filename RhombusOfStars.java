package L01.WorkingWithAbstraction.Lab;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopHalf(n);
        printBottomHalf(n);


    }
    private static void printTopHalf(int size) {
        for (int starCount = 1; starCount <= size; starCount++) {
            printRow(size, starCount);
        }
    }

    private static void printBottomHalf(int size) {
        for (int starCount = size - 1; starCount > 0; starCount--) {
            printRow(size, starCount);
        }
    }

    private static void printRow(int size, int starCount) {
        for (int i = 0; i < size - starCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starCount - 1; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }

}
