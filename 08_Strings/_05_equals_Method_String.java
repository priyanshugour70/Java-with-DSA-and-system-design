public class _05_equals_Method_String {
    
    public static void main(String[] args) {
        // in (equals()) this method java check Value .

        // Normal String Method
        String s1 = "Priyanshu" ;

        // Object String Method
        String s2 = new String("Priyanshu");


        // equals();
        boolean check = s1.equals(s2) ;
        System.out.println(check);
    }
}
