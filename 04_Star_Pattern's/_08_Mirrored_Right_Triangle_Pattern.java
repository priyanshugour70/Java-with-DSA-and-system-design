import java.util.*;

public class _08_Mirrored_Right_Triangle_Pattern {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                    //      *
                    //     **
                    //    ***
                    //   ****
                    //  *****
                    // ******

        int n, blank ; 
        System.out.println("Enter the Height of the Triangle : ");
        n = sc.nextInt();

        blank = n-1 ;

        for(int i = 0 ; n > i ; i++){

            for(int j = blank ; 0 < j ; j--){
                System.out.print(" ");
            }

            for(int k = 0 ; i > k ; k++){
                System.out.print("*");
            }

            System.out.println();
            blank--;
        }


        sc.close();
    }
}
