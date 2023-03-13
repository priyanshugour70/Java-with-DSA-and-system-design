import java.util.*;

public class _19_Hollow_Advance_X_Pattern_in_java {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                    // *           * 
                    //   *       *  
                    //     *   *  
                    //       * 
                    //     *   *
                    //   *       *  
                    // *           * 

        int n ; 
        System.out.println("Enter the Size of X : ");
        n = sc.nextInt();

        for(int i = 1 ; n >= i ; i++){
            
            for(int j = 1 ; n >= j ; j++){
                if(i == j || (i + j == 1 + n)){
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