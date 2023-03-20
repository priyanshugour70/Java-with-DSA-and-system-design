import java.util.*;

public class _12_Palindrome_Program {

    public static void secondCasePalindrome(String str1){

        String str2 = "";

        for(int i = str1.length()-1; i >= 0 ; i--){
            str2 = str2 + str1.charAt(i) ;
        }

        if(str1.equals(str2)){
            System.out.println("Given Sting is Palindrome..");
        }else{
            System.out.println("Given String is not Palindrome..");
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter A Word to Check Palindrome or not : ");
        String str = sc.nextLine() ;

        boolean check = true ;
        int strLen = str.length();

        for(int i = 0 ; strLen/2 > i ; i++){
            if(str.charAt(i) == str.charAt(strLen-1-i)){
                check =true ;
            }else{
                check = false ;
            }
        }

        if(check){
            System.out.println(str + " is Palindrome");
        }else{
            System.out.println(str + " is Not-Palindrome");
        }

        secondCasePalindrome(str);

        sc.close();
    }
}
