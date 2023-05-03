import java.io.*;

public class _08_BufferedWriter_And_FileWriter {
    public static void main(String[] args) throws IOException {

        // the BufferedWriter and FileWriter classes can be used together to write
        // data to a file. The FileWriter class is used to write characters to a file,
        // while the BufferedWriter class provides a buffer for efficient writing of
        // data to the file.

        File dir = new File("Hey");

        File file = new File(dir, "hey.txt");

        FileWriter fw = new FileWriter(file, true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hey Why the way I am Priyanshu Gour");
        bw.newLine();
        bw.write(65); // A
        bw.newLine();
        char ch[] = { 'j', 'a', 'v', 'a' };
        bw.write(ch);
        bw.newLine();

        bw.flush(); // This flush method is Recommened
        bw.close();

    }
}
