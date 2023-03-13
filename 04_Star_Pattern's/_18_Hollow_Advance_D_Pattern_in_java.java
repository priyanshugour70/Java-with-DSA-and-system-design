import java.util.*;

public class _18_Hollow_Advance_D_Pattern_in_java {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                // * * * *
                // *       * 
                // *       * 
                // *       * 
                // * * * *

        int n ; 
        System.out.println("Enter the Size of D : ");
        n = sc.nextInt();

        for(int i = 1 ; n >= i ; i++){
            
            for(int j = 1 ; n/2 >= j ; j++){
                if(j == 1 || (i == 1 && j != n/2) || (j == n/2 && i != 1 && i != n) || (i == n && j != n/2) ){
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
