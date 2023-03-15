import java.util.*;

public class _21_Hollow_Rhombus_Pattern {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            //     * 
            //   *   * 
            // *       * 
            //   *   * 
            //     *   

        int n ;
        System.out.println("Enter the Size of The Rhombus : ");
        n = sc.nextInt();


        for(int i = 0 ; n > i ; i++){

            for(int j = 0 ; n > j ; j++){
                
                if( i + j == (n-1)/2 || j - i == (n-1)/2 || i - j == (n-1) / 2 || i + j == (n-1)/2 + (n-1) ){
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
