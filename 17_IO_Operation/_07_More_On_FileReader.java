import java.io.*;

public class _07_More_On_FileReader {
    public static void main(String[] args) throws IOException {

        File dir = new File("Hey");

        File file = new File(dir, "hey.txt");

        FileReader fr = new FileReader(file);

        char ch[] = new char[(int) file.length()];

        fr.read(ch);

        for (char c : ch) {
            System.out.print(c);
        }

        System.out.println();

        fr.close();
    }
}
