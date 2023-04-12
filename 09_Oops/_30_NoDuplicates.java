import java.util.*;


public class _30_NoDuplicates {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of string for which hou would like to remove the duplicates : ");

        String S1 = sc.next();
        String S2 = "" ;

        for(int i = 0 ; i < S1.length() ; i++){
            boolean isDuplicate = false ;
            for(int j = i + 1 ; j < S1.length(); j++){
                if(S1.charAt(i) == S1.charAt(j)){
                    System.out.println(S1.charAt(i));
                    isDuplicate = true ;
                }
            }
            if(!isDuplicate){
                S2 = S2 + S1.charAt(i);
            }
        }

        System.out.println(S2);

        sc.close();
    }
}
