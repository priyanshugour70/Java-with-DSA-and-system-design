import java.util.*;

public class _13_Hollow_H_Pattern_in_java {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

                    // *         *
                    // *         *
                    // * * * * * *
                    // *         *
                    // *         *
                    // *         *

        int n ;
        System.out.println("Enter the Size of the H : ");
        n = sc.nextInt();
        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; n >= j ; j++){
                if(j == 1 || j == n || i == n/2 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
