import java.util.*;

public class _13_Anagram_Program {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("First Word : ");
        String str1 = sc.nextLine();

        System.out.print("Second Word : ");
        String str2 = sc.nextLine();

        boolean check = false ;

        str1 = str1.trim() ; // for removing whitespace
        str2 = str2.trim() ;


        if(str1.length() == str2.length()){
            str1 = str1.toUpperCase() ; // for creating same type of Character (lower/Upper)
            str2 = str2.toUpperCase() ;

            char str1Arr[] = str1.toCharArray() ;
            char str2Arr[] = str2.toCharArray() ;
            
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);



            for(int i = 0 ; str1Arr.length > i ; i++){
                if(str1Arr[i] == str2Arr[i]){
                    check = true ;
                }else{
                    check = false ;
                }
            }

        }
        if(check){
            System.out.println("Your String is Anagram..");
        }else{
            System.out.println("Your String is Not-Anagram..");
        }


        sc.close();
    }
}
