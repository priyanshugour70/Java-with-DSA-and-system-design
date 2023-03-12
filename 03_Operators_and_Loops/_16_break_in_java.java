public class _16_break_in_java {
    

    public static void main(String args[]){


        // In Java, the break statement is used to prematurely exit a loop (either a for loop, while loop, or do-while loop). When a break statement is executed inside a loop, the control of the program jumps immediately out of the loop.


        // Here is an example of using break in a for loop in Java:
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
              break; // exit loop if i equals 5
            }
          }
          
          
    }
}
