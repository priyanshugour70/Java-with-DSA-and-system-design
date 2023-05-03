import java.io.*;

public class _06_Reading_Data_Onto_File_using_FileReader {
    public static void main(String[] args) throws IOException {

        File dir = new File("Hey");
        File file = new File(dir, "hey.txt");

        FileReader fr = new FileReader(file);

        int i = fr.read();

        while (i != -1) { // if File was null then return type is -1.
            System.out.print(i + " -----> ");
            System.out.println((char) i);
            i = fr.read();
        }
        System.out.println();
        fr.close();
    }
}
