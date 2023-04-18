import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_Checked_Unchecked_Exception {
    public static void main(String[] args) {

        // Unchecked Exception
        // Unchecked exceptions are those that do not need to be handled explicitly in
        // your code. If a method throws an unchecked exception, you can choose to catch
        // it or let it propagate up the call stack. Examples of unchecked exceptions
        // include NullPointerException, ArrayIndexOutOfBoundsException, and
        // ArithmeticException.
        int a = 10;
        int b = 0;
        int result = a / b; // This will throw an ArithmeticException

        System.out.println(result);

        System.out.println("----------------------------------------");

        // checked Exception
        // Checked exceptions are those that the compiler requires you to handle
        // explicitly in your code. If you call a method that throws a checked
        // exception, you must either catch that exception or declare that your method
        // throws that exception. Examples of checked exceptions include IOException,
        // SQLException, and ClassNotFoundException.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

    }
}
