import java.util.*;

public class _20_Hollow_Power_Drum_in_java {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // *       * 
        // * *   * *
        // *   *   * 
        // * *   * *
        // *       *

        int n ;
        System.out.println("Enter the Size of HollowPowerDrum : ");
        n = sc.nextInt();

        for(int i = 1 ; n >= i ; i++){

            for(int j = 1 ; n >= j ; j++){
                if(j == 1 || j == n || j ==i || (j + i == n + 1)){
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
