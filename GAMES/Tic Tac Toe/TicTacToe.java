import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main
{
    static String[] playerCharacters = {" O ", " X "};
    static Scanner scanner = new Scanner(System.in);

    private static void displayGrid(String[][] grid) {
        for (String[] row: grid)
            System.out.println(Arrays.toString(row));
    }


    private static boolean allEqual(String a, String b, String c) {
        HashSet<String> set = new HashSet<>(Arrays.asList(a, b, c));
        return set.size() == 1;
    }


    private static boolean gameOver(String[][] grid, int counter) {
        if (counter < 5)
            return false;

        if (isWinningCondition(grid)){
            if (isEven(counter + 1))
                System.out.println("PLAYER 1 WINS!!!!!!!!!!!!");
            else
                System.out.println("PLAYER 2 WINS!!!!!!!!!!!!");
            return true;
        }
        if (counter == 9) {
            System.out.println("\nIts a DRAwwwww.");
            return true;
        }

        return false;
    }


    private static boolean isWinningCondition(String[][] grid) {
         return allEqual(grid[0][0], grid[1][1], grid[2][2]) || allEqual(grid[0][2], grid[1][1], grid[2][0]) ||
                allEqual(grid[0][0], grid[1][0], grid[2][0]) || allEqual(grid[0][1], grid[1][1], grid[2][1]) || allEqual(grid[0][2], grid[1][2], grid[2][2]) ||
                allEqual(grid[0][0], grid[0][1], grid[0][2]) || allEqual(grid[1][0], grid[1][1], grid[1][2]) || allEqual(grid[2][0], grid[2][1], grid[2][2]);
    }


    private static boolean isEven(int n) {
        return (n & 1) != 1;
    }


    private static void fillPlayerInput(String[][] grid, int position, int counter) {
        int row = position / 3;
        int col = position % 3;

        grid[row][col] = isEven(counter) ? playerCharacters[0] : playerCharacters[1];
    }


    private static int takePlayerInput(int counter) {
        if (isEven(counter))
            System.out.print("\nPLAYER 1 TURN");
        else
            System.out.print("\nPLAYER 2 TURN");

        System.out.println(" (enter position...)");
        int position = scanner.nextInt();
        return position - 1;
    }


    public static void main(String[] args) {
        String[][] grid = {
                {"=1=", "=2=", "=3="},
                {"=4=", "=5=", "=6="},
                {"=7=", "=8=", "=9="}
        };
        
        System.out.println("======== This Is The Original Grid and Its Positions ========\n");
        displayGrid(grid);

        int counter = 0;

        while (!gameOver(grid, counter)) {
            int playerInputPosition = takePlayerInput(counter);
            fillPlayerInput(grid, playerInputPosition, counter);
            displayGrid(grid);
            counter++;
        }

        System.out.println("---GAME OVER---");
    }

}
