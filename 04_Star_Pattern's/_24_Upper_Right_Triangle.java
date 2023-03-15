import java.util.*;

public class _24_Upper_Right_Triangle {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //               * * * * * * * * * 
        //                 * * * * * * * * 
        //                   * * * * * * * 
        //                     * * * * * * 
        //                       * * * * * 
        //                         * * * * 
        //                           * * * 
        //                             * * 
        //                               * 

        int n ; 
        System.out.println("Enter the Size of the Rhombus : ");
        n = sc.nextInt();

        for(int i = 0 ; n > i ; i++){

            for(int j = 0 ; n > j ; j++){

                // for Fill upper right Area   ==>  (i == 0 && j >= (n-1)/2 || j==n-1 && i <=(n-1)/2 || j-i >= (n-1)/2)

                if(i == 0 && j >= (n-1)/2 || j==n-1 && i <=(n-1)/2 || j-i >= (n-1)/2 ){
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
