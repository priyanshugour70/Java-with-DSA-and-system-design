import java.io.*;

public class _09_BufferedReader_And_FileReader {
    public static void main(String[] args) throws IOException {

        // BufferedReader and FileReader are two classes that are commonly used to read
        // data from a file.
        // BufferedReader is a class in Java that is used to read text from a character
        // input stream (e.g., a file). It reads the data in chunks and stores it in
        // memory, which makes it faster than reading the data character-by-character.
        // It also provides a readLine() method, which reads a line of text from the
        // input stream.

        File dir = new File("Hey");
        File file = new File(dir, "hey.txt");

        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);

        String str = br.readLine();

        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }

        System.out.println();

        br.close();
    }
}
