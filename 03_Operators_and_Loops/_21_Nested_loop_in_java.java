public class _21_Nested_loop_in_java {
    

    public static void main(String args[]){


        // A nested loop in Java is a loop inside another loop. The inner loop is executed multiple times for each iteration of the outer loop. Nested loops are useful for iterating over two-dimensional arrays, performing matrix multiplication, generating permutations, and many other tasks that involve nested iterations.

        // Here's an example of a nested loop in Java that prints the multiplication table up to 10:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
              System.out.print(i * j + " ");
            }
            System.out.println();
          }

    }
}
