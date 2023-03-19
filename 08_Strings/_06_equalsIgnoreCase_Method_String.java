public class _06_equalsIgnoreCase_Method_String {
    
    public static void main(String[] args) {
        // in (equalsIgnoreCase()) this method java check Value but ignore casesensivity.

        // Normal String Method
        String s1 = "PRIYANSHU" ;

        // Object String Method
        String s2 = new String("priyanshu");


        // equalsIgnoreCase();
        boolean check = s1.equalsIgnoreCase(s2) ;
        System.out.println(check);
    }
}
