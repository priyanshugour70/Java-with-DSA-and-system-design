import java.util.Scanner;

public class _05_Exception_Handling_TryWithResources {

    public static void main(String[] args) {

        int x = 0;

        try (Scanner sc = new Scanner(System.in)) { // After Input the file is direct Close without use sc.close()
            x = sc.nextInt();
        }

        System.out.println(x);
    }
}
