import java.util.*;

public class _02_Rectange_Pattern_in_java {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int len, wid ;
        System.out.println("Enter the lenth of the Rectange :  ");
        len = sc.nextInt();

        System.out.println("Enter the Width of the Rectange :  ");
        wid = sc.nextInt();

        for(int i = 0 ; wid > i ; i++){
            for(int j = 0 ; len > j ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
}