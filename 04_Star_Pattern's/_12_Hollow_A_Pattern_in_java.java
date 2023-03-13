import java.util.*;

public class _12_Hollow_A_Pattern_in_java {    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
                    // * * * * * *
                    // *         *
                    // *         *
                    // * * * * * *
                    // *         *
                    // *         *

        int n ;
        System.out.println("Enter the Size of the A : ");
        n = sc.nextInt();
        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; n >= j ; j++){
                if(i == 1 || j == 1 || j == n || i == n/2 ){
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
