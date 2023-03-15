import java.util.*;

public class _26_Lower_Right_Triangle {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //                              * 
        //                            * * 
        //                          * * * 
        //                        * * * * 
        //                      * * * * * 
        //                    * * * * * * 
        //                  * * * * * * * 
        //                * * * * * * * * 

        int n ; 
        System.out.println("Enter the Size of the Rhombus : ");
        n = sc.nextInt();

        for(int i = 0 ; n > i ; i++){

            for(int j = 0 ; n > j ; j++){

                // for Fill Lower right Area   ==>  (j == n-1 && i >= (n-1)/2 || i == n-1 && j >= (n-1)/2 || i+j > n-1 + (n-1)/2 )

                if( j == n-1 && i >= (n-1)/2 || i == n-1 && j >= (n-1)/2 || i+j > n-1 + (n-1)/2  ){
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
