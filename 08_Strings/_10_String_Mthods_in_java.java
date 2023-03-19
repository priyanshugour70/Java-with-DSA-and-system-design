public class _10_String_Mthods_in_java {
    
    public static void main(String[] args) {
        
        // All Common String Method we will discuss in this program .. 

        String str = "Priyanshu Gour" ;

        System.out.println(str);
        System.out.println(str.toUpperCase());  // toUpperCase()
        System.out.println(str.toLowerCase());  // toLowerCase()
        System.out.println(str.length());  // length()
        System.out.println(str.charAt(10));  // charAt()
        System.out.print(str.substring(2));//searching from 2 to end of the string
        System.out.println(str.substring(4, 14));  // substring(start, end)
        System.out.println(str.indexOf('G')) ;   // indexOf('G')
        System.out.println(str.lastIndexOf('u'));   // lastIndexOf('u')
        System.out.println(str.trim());  // To remove the blank spaces present at the beginning and end of string but not the blank spaces present at the middle of the String.

        String s="ababab";
        System.out.print(s.replace('a','b')); //bbbbbb
        
    }
}
