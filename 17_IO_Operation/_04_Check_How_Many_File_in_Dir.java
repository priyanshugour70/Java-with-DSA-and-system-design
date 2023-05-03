import java.io.*;

public class _04_Check_How_Many_File_in_Dir {
    public static void main(String[] args) throws IOException {
        int count = 0;
        File f = new File("JAVA");

        String strArr[] = f.list();

        for (String name : strArr) {
            count++;
            System.out.println(name);
        }

        System.out.println("Total " + count + " Files in java.");

    }
}
