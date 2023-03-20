import java.util.*;

public class _11_Reversing_String {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        

        System.out.println("Case : 1 (Character Reversing)");
        System.out.print("Enter String : ");

        
        String str = sc.nextLine();
        String str1 = "";

        for(int i = str.length()-1 ; i >= 0 ; i--){
            str1 = str1 + str.charAt(i);
        }

        System.out.println("Before Reversing : " + str);
        System.out.println("After Reversing : " + str1);





        System.out.println("Case : 2 (Word Reversing)");
        System.out.print("Enter String : ");

        String str2 = sc.nextLine();
        String str3 = "";

        String sArr[] = str2.split(" ");

        for(int i = sArr.length-1 ; i >= 0 ; i--){
            str3 = str3 + sArr[i] + " " ;
        }

        // // Logic 

        // for(String st : sArr){
        //     for(int i = st.length()-1 ; i >= 0 ; i--){
        //         str3 = str3 + str2.charAt(i) ;
        //     }
        //     str3 = str3 + " ";
        // }

        System.out.println("Before Reversing : " + str2);
        System.out.println("After Reversing : " + str3);



        sc.close();
    }
}
