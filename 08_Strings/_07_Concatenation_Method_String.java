public class _07_Concatenation_Method_String {
    
    public static void main(String[] args) {
        
        // Using ( concat()) Concatenation in String
        String s1 = new String("Priyanshu");

        // Using (concat()) Not change the s1 value because String are Immutable

        s1.concat(" Gour");  // in this way the new String Create in Heap memory (outoff SCP) with the value of (Priyanshu Gour) but No one variable refer the value
        System.out.println(s1); // Priyanshu

        s1 = s1.concat(" Gour") ; // in this way the new String Create in Heap memory (outoff SCP) with the value of (Priyanshu Gour) and the s1 variable refer the value .  
        System.out.println(s1); // Priyanshu Gour
    }
}
