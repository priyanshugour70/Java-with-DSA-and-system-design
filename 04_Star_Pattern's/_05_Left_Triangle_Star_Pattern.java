import java.util.*;

public class _05_Left_Triangle_Star_Pattern {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                    //           * 
                    //         * * 
                    //       * * * 
                    //     * * * * 
                    //   * * * * * 
        
        int n, h ; 
        System.out.println("Enter the Height of the Left Triangle :  ");
        n = sc.nextInt();

        h = n-1 ;
        for(int i = 0 ; n > i ; i++){

            for(int j = h ; j > 0 ; j-- ){
                System.out.print("  ");
            }

            for(int k = 0 ; i > k ; k++){
                System.out.print("* ");
            }
            System.out.println();
            h--;
        }
        sc.close();
    }
}
