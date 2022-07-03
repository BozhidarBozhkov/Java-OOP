package WorkingWithAbstraction.Exercise.P05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class P05JediGalaxy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner.nextLine());

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxy = new int[rows][cols];

        fillInGalaxy(rows, cols, galaxy);

        String command = scanner.nextLine();

        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] playerCoordinates = readPositions(command);
            int[] evilCoordinates = readPositions(scanner.nextLine());

            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            evilDestroyStars(galaxy, evilRow, evilCol);

            int playerRow = playerCoordinates[0];
            int playerCol = playerCoordinates[1];

            starsCollected = starsSum(galaxy, starsCollected, playerRow, playerCol);

            command = scanner.nextLine();
        }

        System.out.println(starsCollected);
    }
    private static int[] readPositions(String scanner) {
        return Arrays.stream(scanner.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    private static void fillInGalaxy(int rows, int cols, int[][] galaxy) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = value;
                value++;
            }
        }
    }
    private static long starsSum(int[][] galaxy, long sum, int playerRow, int playerCol) {
        while (playerRow >= 0 && playerCol < galaxy[1].length) {
            if (isInBounds(galaxy, playerRow, playerCol)) {
                sum += galaxy[playerRow][playerCol];
            }
            playerRow--;
            playerCol++;
        }
        return sum;
    }
    private static void evilDestroyStars(int[][] galaxy, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (isInBounds(galaxy, evilRow, evilCol)) {
                galaxy[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }
    private static boolean isInBounds(int[][] galaxy, int row, int col) {
        return row >= 0 && col >= 0 && row < galaxy.length && col < galaxy[row].length;
    }
}
