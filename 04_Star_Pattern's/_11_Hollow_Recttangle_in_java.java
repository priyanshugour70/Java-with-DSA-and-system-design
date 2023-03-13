import java.util.*;

public class _11_Hollow_Recttangle_in_java {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
                    // * * * * * *
                    // *         *
                    // *         *
                    // * * * * * *

        int l , w ;
        System.out.println("Enter the Length of the Rectange : ");
        l = sc.nextInt();

        System.out.println("Enter the Width of the Rectange : ");
        w = sc.nextInt();

        for(int i = 1 ; l >= i ; i++){

            for(int j = 1 ; w >= j ; j++){
                if(i == 1 || j == 1 || j == w || i == l ){
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