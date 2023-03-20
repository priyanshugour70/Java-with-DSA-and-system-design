import java.util.*;

public class _14_Pangram_Program {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine() ;
        
        str = str.replace(" ", "") ;
        str = str.toUpperCase() ;
        
        char strArr[] = str.toCharArray() ;

        int intArr[] = new int[26] ;

        for(int i = 0 ; strArr.length > i ; i++){
            intArr[strArr[i]-65]++ ;
        }

        boolean check = true ;

        for(int i = 0 ; intArr.length > i ; i++){
            if(intArr[i] == 0){
                check = false ;
            }
        }

        if(check){
            System.out.println("This Sting is a Pangram ...");
        }else{
            System.out.println("This String is Not-Pangram ...");
        }

  
        sc.close();
    }
}
