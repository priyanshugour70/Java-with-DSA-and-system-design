public class _09_Concatenation_Method3_String {
    
    public static void main(String[] args) {
        
        // Using (+ Operator) Concatenation in String
        String s1 = "Hello ";
        String s2 = "Priyanshu" + " Gour"; // In This method new s2 variable cont the value of (Priyanshu & Gour) in one variable in (SCP).  without new object create becaue if we use refrence variable or pre-defined method then the new object was create in heap . but in this care No One new object create . 
        String s3 = "Priyanshu" + " Gour" + " From Harda" ; // Same as it is no one new object create
        String s4 = s1 + s2 ; // but in this care new Object was created in heap out off the (SCP) because this was use refrence variables.


        System.out.println(s1); //Hello
        System.out.println(s2); // Priyanshu Gour
        System.out.println(s3); // Priyanshu Gour Form Harda
        System.out.println(s4); // Hello Priyanshu Gour
    }
}
