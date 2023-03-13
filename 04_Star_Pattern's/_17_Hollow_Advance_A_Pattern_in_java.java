import java.util.*;

public class _17_Hollow_Advance_A_Pattern_in_java {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                //   * * *
                // *       *
                // * * * * *
                // *       *
                // *       *


        int n ; 
        System.out.println("Enter the Size of the A :  ");
        n = sc.nextInt();

        for(int i = 1 ; n >= i ; i++){
            for(int j = 1 ; n/2 >= j ; j++){
                if(i == n/2 || (i == 1 && j != n/2 && j != 1) || (j == 1 && i != 1) || (j == n/2 && i != 1)){
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
