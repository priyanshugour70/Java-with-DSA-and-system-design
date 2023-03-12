public class _17_continue_in_java {
    

    public static void main(String args[]){


        // In Java, the continue statement is used to skip the remaining iterations of a loop and move on to the next iteration. It is typically used within loops to skip some code execution based on certain conditions.


        // Here is an example of using continue in a for loop in Java:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
              continue; // skip iteration when i is 5
            }
            System.out.println(i);
          }

        
    }
}
