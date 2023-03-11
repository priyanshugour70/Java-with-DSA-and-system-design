public class _09_Ternary_Operator {
    
    public static void main(String args[]){


        // In Java, the ternary operator is a shorthand way of writing an if-else statement. It is written in the form of:

        // condition ? expressionIfTrue : expressionIfFalse;

        // Simple Ternary Operator:
        // This is the most basic ternary operator, where a single condition is checked and a single expression is returned based on whether the condition is true or false.
        int x = 5;
        int y = (x > 3) ? 10 : 20;
        // The value of y will be 10 because the condition (x > 3) is true
        System.out.println(y);


        // Nested Ternary Operator:
        // This is where one or more ternary operators are nested inside another ternary operator.
        int a = 5;
        int b = (a > 3) ? ((a < 7) ? 10 : 20) : 30;
        // The value of y will be 10 because both conditions (x > 3) and (x < 7) are true
        System.out.println(b);


        // Multiple Ternary Operators:
        // This is where multiple ternary operators are chained together to check multiple conditions and return multiple expressions.
        int p = 5;
        int q = (p > 3) ? (p < 7) ? 10 : 20 : 30;
        // The value of y will be 10 because both conditions (x > 3) and (x < 7) are true
        System.out.println(q);
        
    }
}
