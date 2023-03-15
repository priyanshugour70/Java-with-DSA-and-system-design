import java.util.*;

public class _22_Hollow_Multi_Rhombus_In_Rectange {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        int n ; 
        System.out.println("Enter The Size of the Multipul Rhombus : ");
        n = sc.nextInt();


        for(int i = 0 ; n > i ; i++){

            for(int j = 0 ; n > j ; j++){
                if( (i == j) || (i + j == (n-1)) || (i == 0) || (j == 0) || (i == n-1) || (j == n-1) || (i + j == (n-1)/2) || (j - i == (n-1)/2) || (i - j == (n-1) / 2) || (i + j == (n-1)/2 + (n-1))){
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
