import java.util.*;

public class _06_Diamond_Shape_Pattern {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                    //      *
                    //     ***
                    //    *****
                    //   *******
                    //  *********
                    //   *******
                    //    *****
                    //     ***
                    //      *


        int n, ut, lt ; 
        System.out.println("Enter the Height of the Diamod : ");
        n = 1 + sc.nextInt();

        ut = n-1 ;
        lt = 1 ;
        for(int i = 0 ; i < n ; i++){

            for(int j = ut ; 0 < j ; j-- ){
                System.out.print(" ");
            }

            for(int k = 0 ; i+i-1 > k ; k++){
                System.out.print("*");
            }

            System.out.println();
            ut--;
        }
        for(int i = n-2 ; i > 0 ; i--){

            for(int l = 0 ; lt > l ; l++){
                System.out.print(" ");
            }

            for(int k = i+i-1 ; 0 < k ; k--){
                System.out.print("*");
            }

            System.out.println();
            lt++;
        }


        sc.close();
    }
}

