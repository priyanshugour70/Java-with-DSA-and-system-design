import java.util.Arrays;

public class _09_RatInAMaze_Using_Backtracking {

    public static boolean isSafe(int[][] maze, int x, int y, int n) {
        if (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static boolean solveMaze(int[][] maze, int[][] sol, int x, int y, int n) {
        // Base Case
        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y, n)) {

            // Check if current block is already visited
            if (sol[x][y] == 1) {
                return false;
            }
            // Mark the current block as visited
            sol[x][y] = 1;

            // Recurse
            if (solveMaze(maze, sol, x + 1, y, n)) {
                return true;
            }

            if (solveMaze(maze, sol, x, y + 1, n)) {
                return true;
            }

            if (solveMaze(maze, sol, x - 1, y, n)) {
                return true;
            }

            if (solveMaze(maze, sol, x, y - 1, n)) {
                return true;
            }

            // Backtracking
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 0 },
                { 1, 0, 1, 1 }
        };
        int[][] sol = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };

        int length = maze.length;

        if (solveMaze(maze, sol, 0, 0, length)) {
            System.out.println(Arrays.deepToString(sol));
        } else {
            System.out.println("Solution does not exist... ");
        }
    }
}