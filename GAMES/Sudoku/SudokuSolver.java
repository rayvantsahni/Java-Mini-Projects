import java.util.Arrays;

public class Main
{

    public static void sudokuSolver(int[][] board) {
        sudokuSolver(board, 0, 0);
    }

    
    public static void sudokuSolver(int[][] board, int row, int col) {
        if (row == board.length) {
            displayBoard(board);
            return;
        }

        if (col == board.length) {
            sudokuSolver(board, row + 1, 0);
            return;
        }

        if (board[row][col] == 0) {
            for (int num = 1; num <= 9; num++) {
                if (isLegalMove(board, row, col, num)) {
                    board[row][col] = num;
                    sudokuSolver(board, row, col + 1);
                    board[row][col] = 0;
                }
            }
        }

        else {
            sudokuSolver(board, row, col + 1);
        }

    }


    private static void displayBoard(int[][] board) {
        for (int[] row: board)
            System.out.println(Arrays.toString(row));
    }


    private static boolean isLegalMove(int[][] board, int row, int col, int value) {
        for (int i = 0; i < 9; i++)
            if (board[i][col] == value)
                return false;

        for (int i = 0; i < 9; i++)
            if (board[row][i] == value)
                return false;

        for (int i = 3 * (row / 3); i < 3 * (row / 3) + 3; i++)
            for (int j = 3 * (col / 3); j < 3 * (col / 3) + 3; j++)
                if (board[i][j] == value)
                    return false;

        return true;

    }


    public static void main(String[] args) {
//        int[][] sudoku =
//                {{3, 0, 6, 5, 0, 8, 4, 0, 0},
//                 {5, 2, 0, 0, 0, 0, 0, 0, 0},
//                 {0, 8, 7, 0, 0, 0, 0, 3, 1},
//                 {0, 0, 3, 0, 1, 0, 0, 8, 0},
//                 {9, 0, 0, 8, 6, 3, 0, 0, 5},
//                 {0, 5, 0, 0, 9, 0, 6, 0, 0},
//                 {1, 3, 0, 0, 0, 0, 2, 5, 0},
//                 {0, 0, 0, 0, 0, 0, 0, 7, 4},
//                 {0, 0, 5, 2, 0, 6, 3, 0, 0}};

//        int[][] sudoku =
//                   {{ 3, 1, 6, 5, 7, 8, 4, 9, 2 },
//                    { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
//                    { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
//                    { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
//                    { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
//                    { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
//                    { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
//                    { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
//                    { 7, 4, 5, 0, 8, 6, 3, 1, 0 }};


        int[][] sudoku =
                   {{5, 8, 0, 2, 0, 0, 4, 7, 0},
                    {0, 2, 0, 0, 0, 0, 0, 3, 0},
                    {0, 3, 0, 0, 5, 4, 0, 0, 0},
                    {0, 0, 0, 5, 6, 0, 0, 0, 0},
                    {0, 0, 7, 0, 3, 0, 9, 0, 0},
                    {0, 0, 0, 0, 9, 1, 0, 0, 0},
                    {0, 0, 0, 8, 2, 0, 0, 6, 0},
                    {0, 7, 0, 0, 0, 0, 0, 8, 0},
                    {0, 9, 4, 0, 0, 6, 0, 1, 5}};

        sudokuSolver(sudoku);
    }
}



// For reference: https://www.youtube.com/watch?v=bQawtlf-qM4
