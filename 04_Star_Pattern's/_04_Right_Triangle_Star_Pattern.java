import java.util.*;

public class _04_Right_Triangle_Star_Pattern {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

                    // *
                    // * *
                    // * * *
                    // * * * *
                    // * * * * *
        int n ;
        System.out.print("Enter the Height of Right Triangel : ");
        n = sc.nextInt();


        for(int i = 0 ; n > i ; i++){
            for(int j = 0 ; i > j ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
