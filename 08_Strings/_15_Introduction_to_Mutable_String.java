public class _15_Introduction_to_Mutable_String {
    
    public static void main(String[] args) {
        
        // # Mutable String
        // Once if we create a String, on that String if we try to perform any operation and if
        // those changes get reflected in the same object then such strings are called “Mutable String”.
        // Example: StringBuffer, StringBuilder
        
        StringBuffer pg = new StringBuffer("Priyanshu ");

        System.out.println(pg);
        pg.append("Gour");
        System.out.println(pg);


        StringBuilder dg = new StringBuilder("Devanshu ");

        System.out.println(dg);
        dg.append("Gour");
        System.out.println(dg);
    }
}
