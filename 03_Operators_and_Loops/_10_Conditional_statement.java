public class _10_Conditional_statement {
    

    public static void main(String args[]){


        // In Java, there are three types of conditional statements: if, else-if, and else. These statements allow the programmer to control the flow of execution of the program based on certain conditions. Here are some examples of each type of statement:


        // If statement: The if statement is used to test a condition and execute a block of code only if the condition is true.
        int age = 18;
        if (age >= 18) {
          System.out.println("You are eligible to vote.");
        }

        

        // Else-if statement: The else-if statement is used to test multiple conditions, and execute different blocks of code depending on which condition is true.
        int score = 75;
        if (score >= 90) {
          System.out.println("You got an A.");
        } else if (score >= 80) {
          System.out.println("You got a B.");
        } else if (score >= 70) {
          System.out.println("You got a C.");
        } else {
          System.out.println("You got an F.");
        }

        

        // Else statement: The else statement is used to execute a block of code when the if condition is false.
        int num = 5;
        if (num < 0) {
          System.out.println("The number is negative.");
        } else {
          System.out.println("The number is positive.");
        }
        
    }
}