public class _08_Logical_Operators {
    

    public static void main(String args[]){


        // In Java, there are three types of logical operators:

        // AND operator (&&)
        // The AND operator (&&) returns true if and only if both operands are true. Otherwise, it returns false. Here's an example:

        int x = 5;
        int y = 10;
        if (x > 0 && y > 0) {
           System.out.println("Both x and y are positive");
        }


        // OR operator (||)
        // The OR operator (||) returns true if at least one of the operands is true. Otherwise, it returns false. Here's an example:

        int p = 5;
        int q = -10;
        if (p > 0 || q > 0) {
           System.out.println("At least one of p and q is positive");
        }


        // NOT operator (!)
        // The NOT operator (!) returns the opposite of the boolean value of the operand. If the operand is true, it returns false. If the operand is false, it returns true. Here's an example:

        boolean a = true;
        if (!a) {
           System.out.println("a is false");
        } else {
           System.out.println("a is true");
        }

    }
}
