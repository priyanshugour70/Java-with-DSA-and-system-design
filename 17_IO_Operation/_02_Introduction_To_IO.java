import java.io.*;

public class _02_Introduction_To_IO {
    public static void main(String[] args) throws IOException {

        // File file = new File("priyanshu.txt");
        // System.out.println(file.exists()); // This for check a File exists or not.

        // file.createNewFile(); // This for Creating a new file..
        // System.out.println(file.exists());

        File dir = new File("priyanshu");
        System.out.println(dir.exists()); // This for check a Folder exists or not.

        dir.mkdir(); // This for Creating a new Folder..
        System.out.println(dir.exists());
    }
}
