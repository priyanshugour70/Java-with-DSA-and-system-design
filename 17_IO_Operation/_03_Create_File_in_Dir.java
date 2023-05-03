import java.io.*;

public class _03_Create_File_in_Dir {
    public static void main(String[] args) throws IOException {

        File dir = new File("JAVA");
        System.out.println(dir.isDirectory());

        dir.mkdir();

        File file = new File(dir, "HelloWorld.java");
        file.createNewFile();
        System.out.println(file.isFile());

    }
}