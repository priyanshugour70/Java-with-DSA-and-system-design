public class _05_NsQueenProblem_Using_Backtracking {
    public static void printSolution(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int column, int n) {
        int i, j;

        // Check this row on left side
        for (i = 0; i < column; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper diagonal on left side
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower diagonal on left side
        for (i = row, j = column; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // function to solve n Queen problem
    static boolean solvenQueen(int board[][], int column, int n) {
        /*
         * Base case - if all the queens have got placed then return true
         */
        if (column >= n) {
            return true;
        }

        // consider this column and try placing all the queens one by one in all the
        // rows
        for (int i = 0; i < n; i++) {
            // check if it is safe to place the queen or not
            if (isSafe(board, i, column, n)) {
                // place the queen in the board
                board[i][column] = 1;

                // recursive call for remaining queens
                if (solvenQueen(board, column + 1, n) == true) {
                    return true;
                }

                // if placing the queen does not lead to solution then backtrack
                board[i][column] = 0;
            }
        }

        // if it is not possible to place the queen in any row of the given column then
        // return false
        return false;
    }

    public static void main(String[] args) {
        int[][] board = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        if (solvenQueen(board, 0, board.length) == true) {
            printSolution(board, board.length);
        } else {
            System.out.print("Solution does not exist");
        }
    }
}