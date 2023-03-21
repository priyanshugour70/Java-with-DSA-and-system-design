public class _16_final_vs_Immutability {
    
    public static void main(String[] args) {
        
        // Final Keyword :- it means if we use final keyword then the refrence is fix we don't change to refrence .  

        final float PI = 3.141f ;  // the value is fix we can't change to value of PI
        
        // PI = 3.333 ;
        System.out.println(PI);

        // We apply the final keyword knowledge on the Sting 

        final String pg = "priyanshu gour" ;
        String dg = "devanshu gour" ;
        // pg = "devanshu gour" ; // We can't change the value of pg because we use final keyword so we can't chage the refrence of the variable..
        dg = "priyanshu gour" ;

        System.out.println(pg);
        System.out.println(dg);

        final StringBuilder strB = new StringBuilder("i am devil");

        System.out.println(strB);
        strB.append(" But not harmfull.") ; // value was change because we use StringBuilder so the refrence was not change but value is change .. 
        System.out.println(strB);

    }
}
