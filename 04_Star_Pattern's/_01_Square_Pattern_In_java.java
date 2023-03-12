import java.util.*;

public class _01_Square_Pattern_In_java {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int side ;
        System.out.println("Enter the side of the Square :  ");
        side = sc.nextInt();

        for(int i = 0 ; side > i ; i++){
            for(int j = 0 ; side > j ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
}