class One {
    void ones() throws Exception {
        twos();
    }

    void twos() throws Exception {
        System.out.println("hey I am Chota Don");
    }
}

public class _06_EH_Handling_vs_Ducking {

    public static void main(String[] args) {

        One o = new One();

        try {
            o.ones();
        } catch (Exception e) {
            System.out.println("Error in this Code : " + e);
        }

    }
}

// Ducking the exception is a term that refers to not handling an exception and
// letting it propagate
// up the call stack until it's handled by some other part of the program or the
// JVM itself.
// This can be done by adding a throws clause to the method signature, which
// indicates that
// the method may throw an exception and that it's the responsibility of the
// calling code to handle it.
// Here's an example:

// public static int divide(int num1, int num2) throws Exception {
// if (num2 == 0) {
// throw new Exception("Cannot divide by zero");
// }
// return num1 / num2;
// }
