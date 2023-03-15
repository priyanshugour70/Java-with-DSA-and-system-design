import java.util.*;

public class _23_Upper_Left_Triangle {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // * * * * * * * * 
        // * * * * * * *   
        // * * * * * *     
        // * * * * *       
        // * * * *         
        // * * *           
        // * *             
        // *               


        int n ; 
        System.out.println("Enter the Size of the Rhombus : ");
        n = sc.nextInt();

        for(int i = 0 ; n > i ; i++){

            for(int j = 0 ; n > j ; j++){

                // for Fill upper left Area  ==>   (i == 0 && j <= (n-1)/2 || j == 0 && i < (n-1)/2 || i+j <= (n-1)/2)

                if( i == 0 && j <= (n-1)/2 || j == 0 && i < (n-1)/2 || i+j <= (n-1)/2 ){
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
