import java.util.Scanner;

public class _19_Scanner_Input_in_java {
    

    public static void main(String args[]){


        // In Java, the Scanner class is used to read input from various sources such as the console, files, or even strings. It provides several methods to read different types of data such as integers, floating-point numbers, strings, and characters.


        //  # 1  .. In Java, the Scanner class is used to read input from various sources such as the console, files, or even strings. It provides several methods to read different types of data such as integers, floating-point numbers, strings, and characters.
        // import java.util.Scanner;



        //  # 2  .. Once imported, you can create a Scanner object that is associated with a specific input source. For example, to read input from the console, you can create a Scanner object that is associated with the standard input stream (System.in) like this:
        Scanner sc = new Scanner(System.in);


        //  # 3  .. Now you can use various methods provided by the Scanner class to read input from the console. For example, to read an integer, you can use the nextInt() method like this:
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        
        //  # 4  .. Similarly, you can use other methods provided by the Scanner class to read other types of data. For example, to read a string, you can use the nextLine() method like this:
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        

        
        sc.close(); 
    }
}
