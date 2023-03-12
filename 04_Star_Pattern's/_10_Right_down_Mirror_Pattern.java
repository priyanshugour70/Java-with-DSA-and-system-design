import java.util.*;

public class _10_Right_down_Mirror_Pattern {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


                // ***** 
                //  **** 
                //   *** 
                //    ** 
                //     * 

        int n, temp ; 
        System.out.println("Enter the Height of Triangle : ");
        n = sc.nextInt();

        temp = n ;
        for(int i = 0 ; n > i ; i++){

            for(int j = 0 ; i > j ; j++){
                System.out.print(" ");
            }

            for(int k = temp ; 0 < k ; k--){
                System.out.print("*");
            }

            System.out.println();
            temp--;
        }

        sc.close();
    }
}
