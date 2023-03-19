public class _04_Ways_of_Comparison {
    
    public static void main(String args[]){

        // in (==) this method java check refrence not value

        // Normal String Method
        String s1 = "Priyanshu" ;
        String s2 = "Priyanshu" ;

        System.out.println(s1 == s2);

        // Object String Method
        String s3 = new String("Gour");
        String s4 = new String("Gour");

        System.out.println(s3 == s4);
    }
}
