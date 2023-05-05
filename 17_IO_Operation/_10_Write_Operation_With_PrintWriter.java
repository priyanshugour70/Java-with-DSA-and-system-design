import java.io.*;

public class _10_Write_Operation_With_PrintWriter {

    public static void main(String[] args) throws IOException {

        // a PrintWriter is a class that provides methods to write formatted text to a
        // destination such as a file or console. It is different from other classes
        // such as OutputStreamWriter and FileWriter because it can handle different
        // types of data and provides more flexible options for formatting the output.

        // One of the benefits of using a PrintWriter is that it allows you to write
        // different types of data to the output stream using methods like print() and
        // println(). These methods can accept parameters of different types such as
        // integers, floats, strings, and objects, and they automatically convert the
        // data to a string format that can be written to the output stream.

        File dir = new File("Hey");

        File file = new File(dir, "hey.txt");

        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.print("hey  ..!   ");
        pw.println("Hello world!");
        pw.println(32423);
        pw.println("I am The Devil of my World..! ");

        pw.close();
        // pw.flush();
    }
}