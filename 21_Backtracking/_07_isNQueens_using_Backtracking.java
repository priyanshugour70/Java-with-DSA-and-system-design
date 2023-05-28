import java.util.*;

public class _07_isNQueens_using_Backtracking {

    public static boolean nQueens(char board[][], int row) {

        // Base Case
        if (row == board.length) {
            return true;
        }

        // Column Loop
        for (int j = 0; board.length > j; j++) {
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true; // Function Call
                }
                board[row][j] = 'X'; // Backtracking Step

            }
        }

        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left Up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal Right Up
        for (int i = row - 1, j = col + 1; i >= 0 && board.length > j; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("---------------Chess Board----------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; board.length > j; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value of N's : ");
        int n = sc.nextInt();
        char board[][] = new char[n][n];

        for (int i = 0; n > i; i++) {
            for (int j = 0; n > j; j++) {
                board[i][j] = 'X';
            }
        }

        if (nQueens(board, 0)) {
            System.out.println("Solution is Possible ... ");
            printBoard(board);
        } else {
            System.out.println("Solution is Not Possible ... ");
        }
        sc.close();
    }
}
