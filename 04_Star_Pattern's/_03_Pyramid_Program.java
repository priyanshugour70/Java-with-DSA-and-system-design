import java.util.*;

public class _03_Pyramid_Program {

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * *

        int n,t ; 
        System.out.println("Enter the Height of the Pyramid");
        n = sc.nextInt();

        t = n-1 ;
        for(int i = 0 ; n > i ; i++){
            for(int j = t ; 0 < j ; j--){
                System.out.print(" ");
            }
            for(int k = 0 ; k < i ; k++ ){
                System.out.print("* ");
            }
            System.out.println();
            t--;
        }


        sc.close();
    }
}
