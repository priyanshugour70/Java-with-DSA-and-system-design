import java.util.*;

public class _07_Downward_Triangle_Star_Pattern {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                // * * * * * 
                // * * * * 
                // * * * 
                // * * 
                // * 

        int n, o ; 
        System.out.println("Enter Height of the Triangel : ");
        n = sc.nextInt();

        o = n ;
        for(int i = 0 ; n > i ; i++){
            for(int j = o ; 0 < j ; j--){
                System.out.print("* ");
            }
            System.out.println();
            o--;
        }


        sc.close();
    }
}
