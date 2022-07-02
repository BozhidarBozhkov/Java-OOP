package WorkingWithAbstraction.Lab.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Point bottomLeft = new Point(input[0], input[1]);
        Point topRight = new Point(input[2], input[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            Point current = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.contains(current));

        }

    }

}
