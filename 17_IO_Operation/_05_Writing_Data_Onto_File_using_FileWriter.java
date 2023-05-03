import java.io.*;

public class _05_Writing_Data_Onto_File_using_FileWriter {
    public static void main(String[] args) throws IOException {
        File dir = new File("Hello");
        dir.mkdir();
        File file = new File(dir, "hello.txt");
        file.createNewFile();

        // FileWriter fw = new FileWriter(file);
        // in FileWriter we only use parameter file then write in which file. this file
        // all data is remove and new data was added.

        FileWriter fw = new FileWriter(file, true);
        // but in case we will write parameter file and true then the data was modified
        // in the previous file.

        fw.write("Hello World!");
        fw.write("\n");
        fw.write(65); // output is store in ASCII
        fw.write("\n");
        fw.write(97); // output is store in ASCII
        fw.write("\n");
        char ch[] = { 'j', 'a', 'v', 'a' };
        fw.write(ch);

        fw.close(); // If we can't close fw then the data was not added in file.
        // fw.flush(); // flush is also use to close the function.

        System.out.println("Check hello.txt for output");
    }
}
