public class _14_printBoardPaths_Using_Recursion {

    // Time Complexity : O()
    // Space Complexity : O()

    public static void main(String[] args) {

        printBoardPaths(0, 4, "");

    }

    // To Print Board Paths using Recursion..
    public static void printBoardPaths(int curr, int dest, String str) {
        if (curr > dest) {
            return;
        }
        if (curr == dest) {
            System.out.println(str);
            return;
        }

        printBoardPaths(curr + 1, dest, str + 1);
        printBoardPaths(curr + 2, dest, str + 2);
        printBoardPaths(curr + 3, dest, str + 3);
        printBoardPaths(curr + 4, dest, str + 4);
    }

}
